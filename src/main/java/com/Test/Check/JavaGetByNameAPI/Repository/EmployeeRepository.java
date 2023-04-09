package com.Test.Check.JavaGetByNameAPI.Repository;

import com.Test.Check.JavaGetByNameAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByName(String name);
}
