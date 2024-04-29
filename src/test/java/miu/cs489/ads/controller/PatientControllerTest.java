package miu.cs489.ads.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import miu.cs489.ads.dto.response.PatientResponse;
import miu.cs489.ads.model.Address;
import miu.cs489.ads.model.Patient;
import miu.cs489.ads.service.PatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = PatientController.class)
class PatientControllerTest {

    @MockBean
    private PatientService patientService;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ModelMapper modelMapper;

    @Autowired
    ObjectMapper objectMapper;

//    @BeforeEach
//    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
//    }

    @Test
    public void testListAllPatients() throws Exception {
        // Prepare mock data
        List<Patient> patients = List.of( new Patient(1, "John", "Gomes",
                "P10", "1234567890", "john.doe@example.com", LocalDate.of(1990, 5, 15),
                        new Address(1, "Fairfield", "Iowa", "52557",null), null),
                new Patient(2, "Smith", "Smith", "P15", "0987654321",
                        "jane.smith@example.com", LocalDate.of(1985, 9, 20),
                        new Address(2, "123 Main St", "California", "12345",null), null));
        ;

        List<PatientResponse> list = patients.stream().map(patient -> modelMapper.map(patient, PatientResponse.class)).toList();
         when(patientService.getAll()).thenReturn(list);
//
//        ResultActions result = mockMvc.perform(get("/adsweb/api/v1/patient/list"));
//        System.out.println(objectMapper.writeValueAsString(result));
       // System.out.println(result.);

        mockMvc.perform(get("/adsweb/api/v1/patient/list"))
                .andExpectAll(
                        status().isOk(),
                        content().json(objectMapper.writeValueAsString(list)));


               // .andExpect(jsonPath("$[0].firstName").value("John"));
               // .andExpect(jsonPath("$[1].lastName").value("Smith"));
    }

}