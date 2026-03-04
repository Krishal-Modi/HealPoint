package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Specialist;
import com.example.HealPoint.model.SpecialistModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T12:51:15-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class SpecialistMapperImpl implements SpecialistMapper {

    @Override
    public Specialist specialistModelToSpecialist(SpecialistModel specialistModel) {
        if ( specialistModel == null ) {
            return null;
        }

        Specialist specialist = new Specialist();

        specialist.setDescription( specialistModel.getDescription() );
        specialist.setSpecialistId( specialistModel.getSpecialistId() );
        specialist.setSpecialty( specialistModel.getSpecialty() );

        return specialist;
    }

    @Override
    public SpecialistModel specialistToSpecialistModel(Specialist specialist) {
        if ( specialist == null ) {
            return null;
        }

        SpecialistModel specialistModel = new SpecialistModel();

        specialistModel.setDescription( specialist.getDescription() );
        specialistModel.setSpecialistId( specialist.getSpecialistId() );
        specialistModel.setSpecialty( specialist.getSpecialty() );

        return specialistModel;
    }
}
