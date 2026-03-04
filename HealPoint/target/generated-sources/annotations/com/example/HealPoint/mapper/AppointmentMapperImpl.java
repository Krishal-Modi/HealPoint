package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Appointment;
import com.example.HealPoint.entity.Slots;
import com.example.HealPoint.entity.User;
import com.example.HealPoint.model.AppointmentModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T12:51:15-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public AppointmentModel appointmentToAppointmentModel(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentModel appointmentModel = new AppointmentModel();

        appointmentModel.setProviderName( appointmentSlotUserUsername( appointment ) );
        appointmentModel.setBookingDate( appointment.getBookingDate() );

        return appointmentModel;
    }

    @Override
    public Appointment appointmentModelToAppointment(AppointmentModel appointmentModel) {
        if ( appointmentModel == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setBookingDate( appointmentModel.getBookingDate() );

        return appointment;
    }

    private String appointmentSlotUserUsername(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Slots slot = appointment.getSlot();
        if ( slot == null ) {
            return null;
        }
        User user = slot.getUser();
        if ( user == null ) {
            return null;
        }
        String username = user.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
