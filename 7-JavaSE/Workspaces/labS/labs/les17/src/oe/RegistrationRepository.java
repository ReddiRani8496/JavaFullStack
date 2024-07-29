package oe;

public interface RegistrationRepository extends CrudRepository<Registration, String> {
    Optional<Registration> findByEmail(String email);
}