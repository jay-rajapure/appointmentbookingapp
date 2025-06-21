package com.firstproject.appointmentbookingapplication.repository;

import com.firstproject.appointmentbookingapplication.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {

}
