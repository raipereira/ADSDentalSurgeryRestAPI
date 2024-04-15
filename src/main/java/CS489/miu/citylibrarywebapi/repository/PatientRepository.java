package CS489.miu.citylibrarywebapi.repository;

import CS489.miu.citylibrarywebapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT p FROM Patient p WHERE p.firstName LIKE %:searchString% OR p.lastName LIKE %:searchString%")
    List<Patient> searchPatients(@Param("searchString") String searchString);

}
