package miu.cs489.ads.service;

import miu.cs489.ads.execption.NotElementFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class PatientServiceIntegrationTest {
    @Autowired
    private PatientService patientService;

    @Test
    public void testFindPatientById_ValidPatientId() {
        Integer patientId = 1;
        var patient = patientService.getPatientById(patientId);
        assertNotNull(patient.getId());
    }

    @Test
    public void testFindInvalidPatientById() {
        Integer patientId = -1;
        assertThrows(NotElementFoundException.class, () -> patientService.getPatientById(patientId));
    }


}
