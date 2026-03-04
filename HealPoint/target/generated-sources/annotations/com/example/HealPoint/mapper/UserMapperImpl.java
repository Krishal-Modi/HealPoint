package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Specialist;
import com.example.HealPoint.entity.User;
import com.example.HealPoint.model.SpecialistModel;
import com.example.HealPoint.model.UserModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T12:51:15-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userModelToUser(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userModel.getFirstName() );
        user.setLastName( userModel.getLastName() );
        user.setUsername( userModel.getUsername() );
        user.setEmail( userModel.getEmail() );
        user.setPassword( userModel.getPassword() );
        user.setDateOfBirth( userModel.getDateOfBirth() );
        user.setPhoneNumber( userModel.getPhoneNumber() );
        user.setGender( userModel.getGender() );
        user.setAddress( userModel.getAddress() );

        return user;
    }

    @Override
    public UserModel userToUserModel(User user) {
        if ( user == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setFirstName( user.getFirstName() );
        userModel.setLastName( user.getLastName() );
        userModel.setUsername( user.getUsername() );
        userModel.setEmail( user.getEmail() );
        userModel.setPassword( user.getPassword() );
        userModel.setDateOfBirth( user.getDateOfBirth() );
        userModel.setPhoneNumber( user.getPhoneNumber() );
        userModel.setGender( user.getGender() );
        userModel.setAddress( user.getAddress() );

        return userModel;
    }

    @Override
    public User updateUserModel(UserModel userModel, User existingUser) {
        if ( userModel == null ) {
            return existingUser;
        }

        existingUser.setAddress( userModel.getAddress() );
        existingUser.setDateOfBirth( userModel.getDateOfBirth() );
        existingUser.setEmail( userModel.getEmail() );
        existingUser.setFirstName( userModel.getFirstName() );
        existingUser.setGender( userModel.getGender() );
        existingUser.setLastName( userModel.getLastName() );
        existingUser.setPassword( userModel.getPassword() );
        existingUser.setPhoneNumber( userModel.getPhoneNumber() );
        existingUser.setUsername( userModel.getUsername() );

        return existingUser;
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
