package com.empdata.employeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpManagementDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;

}
