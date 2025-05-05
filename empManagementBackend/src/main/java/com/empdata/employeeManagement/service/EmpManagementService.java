package com.empdata.employeeManagement.service;

import com.empdata.employeeManagement.dto.EmpManagementDto;

import java.util.List;

public interface EmpManagementService {

    EmpManagementDto createEmployee(EmpManagementDto empManagementDto);
    EmpManagementDto getEmployeeById(Long employeeId);
    List<EmpManagementDto> getAllEmployees();
    EmpManagementDto updateEmployee(Long employeeId,EmpManagementDto updateEmployee);
    void deleteEmployee(Long employeeId);

}
