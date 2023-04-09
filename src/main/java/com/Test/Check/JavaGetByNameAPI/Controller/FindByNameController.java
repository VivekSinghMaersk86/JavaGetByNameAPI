package com.Test.Check.JavaGetByNameAPI.Controller;

import com.Test.Check.JavaGetByNameAPI.Entity.Employee;
import com.Test.Check.JavaGetByNameAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindByNameController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/CheckName")
    public String testMethod() {
        return "NameListController";
    }

    @RequestMapping(value = "/Employee/{EmpName}", method = RequestMethod.GET)
    public List<Employee> findByEmpName(@PathVariable("EmpName") String name) throws Exception {
        List<Employee> EmpListByName = employeeService.findByEmpName(name);
        return EmpListByName;
    }


}
