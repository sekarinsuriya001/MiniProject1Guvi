package com.empdata.employeeManagement.repository;

import com.empdata.employeeManagement.entity.EmpManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpManagementRepository extends JpaRepository<EmpManagement, Long> {
}
