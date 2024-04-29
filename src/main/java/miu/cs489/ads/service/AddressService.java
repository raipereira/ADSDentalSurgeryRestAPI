package miu.cs489.ads.service;


import miu.cs489.ads.dto.response.AddressPatientResponse;
import miu.cs489.ads.model.Address;

import java.util.List;

public interface AddressService {

    Address register(Address address);
     void registerAll(List<Address> addresses);
    List<AddressPatientResponse> findAll();

    List<AddressPatientResponse> findAllWithPatient();


}
