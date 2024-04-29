package miu.cs489.ads.service;


import miu.cs489.ads.dto.request.PatientRequest;
import miu.cs489.ads.dto.response.PatientResponse;
import miu.cs489.ads.model.Patient;

import java.util.List;

public interface PatientService {

    void registerAll(List<Patient> patients);

    Patient registerOne(Patient patient);

    List<PatientResponse> getAll();

    PatientResponse getPatientById(Integer id);

    PatientResponse register(PatientRequest request);

    PatientResponse update(PatientRequest patientRequest, Integer patientId);

    void delete(Integer patientId);

    List<PatientResponse> searchPatients(String searchString);
}
