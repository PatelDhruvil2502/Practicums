FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/prime-services-0.0.1-SNAPSHOT.jar prime-service.jar
ENTRYPOINT ["java", "-jar", "primes-service.jar"]