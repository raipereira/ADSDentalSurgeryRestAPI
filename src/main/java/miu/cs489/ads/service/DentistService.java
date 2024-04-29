package miu.cs489.ads.service;


import miu.cs489.ads.model.Dentist;

import java.util.List;

public interface DentistService {

    Dentist registerOne(Dentist dentist);

    void registerAll(List<Dentist> dentists);
}
