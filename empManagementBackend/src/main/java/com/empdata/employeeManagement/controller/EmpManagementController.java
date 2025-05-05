package com.empdata.employeeManagement.controller;

import com.empdata.employeeManagement.dto.EmpManagementDto;
import com.empdata.employeeManagement.service.EmpManagementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmpManagementController {

    private EmpManagementService empManagementService;

    // Build Add Employee Rest API

    @PostMapping
    public ResponseEntity<EmpManagementDto>createEmployee(@RequestBody EmpManagementDto empManagementDto){
        EmpManagementDto savedEmployee=empManagementService.createEmployee(empManagementDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee Rest API
    @GetMapping("{id}")
    public ResponseEntity<EmpManagementDto>getEmployeeById(@PathVariable("id") Long employeeId){
        EmpManagementDto empManagementDto=empManagementService.getEmployeeById(employeeId);
        return new ResponseEntity<>(empManagementDto, HttpStatus.OK);
    }

    // Build Get All Employees
    @GetMapping
    public ResponseEntity<List<EmpManagementDto>> getAllEmployees() {
        List<EmpManagementDto> employees=empManagementService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    // Build Update Employee Rest API
    @PutMapping("{id}")
    public ResponseEntity<EmpManagementDto> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmpManagementDto updatedEmployee){
        EmpManagementDto empManagementDto=empManagementService.updateEmployee(employeeId, updatedEmployee);
        return new ResponseEntity<>(empManagementDto, HttpStatus.OK);
    }

    // Build Delete Employee Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("id") Long employeeId){
        empManagementService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee Deleted Successfully!");
    }

}
