package com.firstproject.appointmentbookingapplication.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
    @Id
   int professionalId;
   private int userId,appointmentId;
   private String dateTime;
  /* public Appointment(int userId,int professionalId,int appointmentId,String dateTime){
      this.userId =userId;
      this.professionalId = professionalId;
      this.dateTime = dateTime;
      this.appointmentId =appointmentId;
   }*/

   public int getUserId() {
      return userId;
   }

   public String getDateTime() {
      return dateTime;
   }

   public int getProfessionalId() {
      return professionalId;
   }

   public int getAppointmentId() {
      return appointmentId;
   }

   @Override
   public String toString() {
      return "Appointment{" +
              "userId=" + userId +
              ", professionalId=" + professionalId +
              ", appointmentId=" + appointmentId +
              ", dateTime='" + dateTime + '\'' +
              '}';
   }
}
