package dev.chonaso.demo.springboot_sample1.adapters.controllers;

import dev.chonaso.demo.springboot_sample1.domain.model.Employee;
import dev.chonaso.demo.springboot_sample1.usecases.EmployeeUseCase;
import dev.chonaso.demo.springboot_sample1.usecases.EmployeeUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @Autowired
    EmployeeUseCase employeeUseCase;

    @GetMapping("/login/{employeeId}")
    public String index(@PathVariable("employeeId") Long employeeId){
        Employee employee = employeeUseCase.getEmployee(employeeId);
        if(employee == null){
            return "Hello, world.";
        }else {
            return "Hello, " + employee.getName() + "!";
        }
    }
}