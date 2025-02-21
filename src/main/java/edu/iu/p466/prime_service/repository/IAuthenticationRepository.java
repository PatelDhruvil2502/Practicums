package edu.iu.p466.prime_service.repository;

import java.io.IOException;

import edu.iu.p466.prime_service.model.Customer;

public interface IAuthenticationRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}
