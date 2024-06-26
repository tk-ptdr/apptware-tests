package com.apptware.interview.jpa.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface EmployeeRepository extends JpaRepository<Employee, UUID> {}
