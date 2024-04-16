package CS489.miu.citylibrarywebapi.service;


import CS489.miu.citylibrarywebapi.dto.request.PatientRequest;
import CS489.miu.citylibrarywebapi.dto.response.PatientResponse;
import CS489.miu.citylibrarywebapi.model.Patient;

import java.util.List;

public interface PatientService {

    void registerAll(List<Patient> patients);

    Patient registerOne(Patient patient);

    List<PatientResponse> getAll();

    PatientResponse getOne(Integer id);

    PatientResponse register(PatientRequest request);

    PatientResponse update(PatientRequest patientRequest, Integer patientId);

    void delete(Integer patientId);

    List<PatientResponse> searchPatients(String searchString);
}
