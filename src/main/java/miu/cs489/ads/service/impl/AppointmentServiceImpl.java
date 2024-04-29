package miu.cs489.ads.service.impl;

import miu.cs489.ads.model.Appointment;
import miu.cs489.ads.repository.AppointmentRepository;
import miu.cs489.ads.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository repo;

    public AppointmentServiceImpl(AppointmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void registerAll(List<Appointment> appointments) {
        repo.saveAll(appointments);
    }

    @Override
    public List<Appointment> getAll() {
        return repo.findAll();
    }

}
