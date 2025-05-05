package com.empdata.employeeManagement.service;

import com.empdata.employeeManagement.dto.EmpManagementDto;
import com.empdata.employeeManagement.entity.EmpManagement;
import com.empdata.employeeManagement.exception.EmpNotFoundException;
import com.empdata.employeeManagement.mapper.EmpManagementMapper;
import com.empdata.employeeManagement.repository.EmpManagementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpManagementServiceImpl implements EmpManagementService{

    private  EmpManagementRepository empManagementRepository;

    @Override
    public EmpManagementDto createEmployee(EmpManagementDto empManagementDto) {
        EmpManagement empManagement= EmpManagementMapper.mapToEmpManagement(empManagementDto);
        EmpManagement createEmployee=empManagementRepository.save(empManagement);
        return EmpManagementMapper.mapToEmpManagementDto(createEmployee);
    }

    @Override
    public EmpManagementDto getEmployeeById(Long employeeId) {
        EmpManagement empManagement=empManagementRepository.findById(employeeId)
                .orElseThrow(() -> new EmpNotFoundException("Employee is not exists with given Id:"+employeeId));
        return EmpManagementMapper.mapToEmpManagementDto(empManagement);
    }

    @Override
    public List<EmpManagementDto> getAllEmployees() {
        List<EmpManagement> employees=empManagementRepository.findAll();
        return employees.stream().map(EmpManagementMapper::mapToEmpManagementDto).collect(Collectors.toList());
    }

    @Override
    public EmpManagementDto updateEmployee(Long employeeId,EmpManagementDto updateEmployee) {
        EmpManagement empManagement=empManagementRepository.findById(employeeId)
                .orElseThrow(() -> new EmpNotFoundException("Employee is not exists with given Id:"+employeeId));
        empManagement.setFirstName(updateEmployee.getFirstName());
        empManagement.setLastName(updateEmployee.getLastName());
        empManagement.setEmail(updateEmployee.getEmail());
        EmpManagement updatedEmployee=empManagementRepository.save(empManagement);
        return EmpManagementMapper.mapToEmpManagementDto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        EmpManagement empManagement=empManagementRepository.findById(employeeId)
                .orElseThrow(() -> new EmpNotFoundException("Employee is not exists with given Id:"+employeeId));
        empManagementRepository.deleteById(employeeId);
    }
}
