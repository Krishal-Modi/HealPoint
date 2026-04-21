package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Role;
import com.example.HealPoint.model.RoleModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-21T12:39:50-0400",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleModel roleToRoleModel(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleModel roleModel = new RoleModel();

        roleModel.setRoleId( role.getRoleId() );
        roleModel.setRoleName( role.getRoleName() );

        return roleModel;
    }
}
