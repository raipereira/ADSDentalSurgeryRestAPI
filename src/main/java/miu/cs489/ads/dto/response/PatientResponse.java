package miu.cs489.ads.dto.response;

import miu.cs489.ads.dto.request.AddressResponse;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PatientResponse{
       private Integer id;
       private String firstName;
       private String lastName;
       private String patientNumber;
       private String phoneNumber;
       private String email;
       @DateTimeFormat(pattern = "yyyy-MM-dd")
       private LocalDate dob;
       private AddressResponse address;
       @JsonBackReference
       private AddressPatientResponse primaryAddress;


}
