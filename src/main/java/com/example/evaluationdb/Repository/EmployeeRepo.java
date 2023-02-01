package com.example.evaluationdb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evaluationdb.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
}
