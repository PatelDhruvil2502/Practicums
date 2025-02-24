package edu.iu.p466.prime_service.service;

import java.io.IOException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.iu.p466.prime_service.model.Customer;
import edu.iu.p466.prime_service.repository.IAuthenticationRepository;

@Service
public class AuthenticationService implements IAuthenticationService {

    IAuthenticationRepository authenticationRepository;

    public AuthenticationService(IAuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }

    @Override
    public boolean register(Customer customer) throws IOException {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String passwordEncoded = bc.encode(customer.getPassword());
        customer.setPassword(passwordEncoded);
        return authenticationRepository.save(customer);
    }

    @Override
    public boolean login(String username, String password) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

}
