package com.example.demo.controller;


import com.example.demo.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emp")
    public List<Employee> getAllEmp() {

        return employeeService.getAllEmployee();
    }

    @RequestMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/empUpdate/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
        employeeService.updateEmployee(id, employee);
    }


}
