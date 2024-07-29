package oe;

import java.util.List;




public interface AvailabilityRepository extends CrudRepository<Availability, String> {
	
	List<Availability> findByRegistration_RegId(String regId);
}
