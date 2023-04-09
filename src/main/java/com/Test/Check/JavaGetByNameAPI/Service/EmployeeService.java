package com.Test.Check.JavaGetByNameAPI.Service;

import com.Test.Check.JavaGetByNameAPI.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findByEmpName(String name);
}
