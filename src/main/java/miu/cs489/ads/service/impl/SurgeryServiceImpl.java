package miu.cs489.ads.service.impl;

import miu.cs489.ads.model.Surgery;
import miu.cs489.ads.repository.SurgeryRepository;
import miu.cs489.ads.service.SurgeryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    private SurgeryRepository repo;

    public SurgeryServiceImpl(SurgeryRepository repo) {
        this.repo = repo;
    }

    @Override
    public void registerAll(List<Surgery> surgeries) {
        repo.saveAll(surgeries);
    }

    @Override
    public Surgery registerOne(Surgery surgery) {
        return repo.save(surgery);
    }
}
