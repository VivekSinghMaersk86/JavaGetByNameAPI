package com.Test.Check.JavaGetByNameAPI.ServiceImpl;

import com.Test.Check.JavaGetByNameAPI.Entity.Employee;
import com.Test.Check.JavaGetByNameAPI.Repository.EmployeeRepository;
import com.Test.Check.JavaGetByNameAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findByEmpName(String name) {

            List<Employee> EmpList= employeeRepository.findByName(name);

        return EmpList;
    }
}
