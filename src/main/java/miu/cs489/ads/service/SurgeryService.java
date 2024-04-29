package miu.cs489.ads.service;

import miu.cs489.ads.model.Surgery;

import java.util.List;

public interface SurgeryService {

    void registerAll(List<Surgery> surgeries);

    Surgery registerOne(Surgery surgery);
}
