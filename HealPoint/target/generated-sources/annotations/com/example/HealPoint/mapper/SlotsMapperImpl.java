package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Slots;
import com.example.HealPoint.entity.User;
import com.example.HealPoint.model.SlotsModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-21T12:39:49-0400",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class SlotsMapperImpl implements SlotsMapper {

    @Override
    public SlotsModel slotsToSlotsModel(Slots slots) {
        if ( slots == null ) {
            return null;
        }

        SlotsModel slotsModel = new SlotsModel();

        slotsModel.setProviderId( slotsUserUserId( slots ) );
        slotsModel.setProviderUsername( slotsUserUsername( slots ) );
        slotsModel.setDate( slots.getDate() );
        slotsModel.setEndTime( slots.getEndTime() );
        slotsModel.setStartTime( slots.getStartTime() );
        slotsModel.setStatus( slots.getStatus() );

        return slotsModel;
    }

    @Override
    public Slots slotsModelToSlots(SlotsModel slotsModel) {
        if ( slotsModel == null ) {
            return null;
        }

        Slots slots = new Slots();

        slots.setDate( slotsModel.getDate() );
        slots.setEndTime( slotsModel.getEndTime() );
        slots.setProviderUsername( slotsModel.getProviderUsername() );
        slots.setStartTime( slotsModel.getStartTime() );
        slots.setStatus( slotsModel.getStatus() );

        return slots;
    }

    @Override
    public Slots updateSlotsModel(SlotsModel slotsModel, Slots slots) {
        if ( slotsModel == null ) {
            return slots;
        }

        slots.setDate( slotsModel.getDate() );
        slots.setEndTime( slotsModel.getEndTime() );
        slots.setProviderUsername( slotsModel.getProviderUsername() );
        slots.setStartTime( slotsModel.getStartTime() );
        slots.setStatus( slotsModel.getStatus() );

        return slots;
    }

    private String slotsUserUserId(Slots slots) {
        if ( slots == null ) {
            return null;
        }
        User user = slots.getUser();
        if ( user == null ) {
            return null;
        }
        String userId = user.getUserId();
        if ( userId == null ) {
            return null;
        }
        return userId;
    }

    private String slotsUserUsername(Slots slots) {
        if ( slots == null ) {
            return null;
        }
        User user = slots.getUser();
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
