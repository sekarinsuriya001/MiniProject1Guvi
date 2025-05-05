package com.empdata.employeeManagement.mapper;

import com.empdata.employeeManagement.dto.EmpManagementDto;
import com.empdata.employeeManagement.entity.EmpManagement;

public class EmpManagementMapper {

    public static EmpManagementDto mapToEmpManagementDto(EmpManagement empManagement) {
        return new EmpManagementDto(
            empManagement.getId(),
            empManagement.getFirstName(),
            empManagement.getLastName(),
            empManagement.getEmail()
        );
    }

    public static EmpManagement mapToEmpManagement(EmpManagementDto empManagementDto) {
        return new EmpManagement(
                empManagementDto.getId(),
                empManagementDto.getFirstName(),
                empManagementDto.getLastName(),
                empManagementDto.getEmail()
        );
    }
}
