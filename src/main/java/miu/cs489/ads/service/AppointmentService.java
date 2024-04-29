package miu.cs489.ads.service;

import miu.cs489.ads.model.Appointment;

import java.util.List;

public interface AppointmentService {

    void registerAll(List<Appointment> appointments);

    List<Appointment> getAll();
}
