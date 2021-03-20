package dev.chonaso.demo.springboot_sample1.usecases;

import dev.chonaso.demo.springboot_sample1.domain.model.Employee;
import dev.chonaso.demo.springboot_sample1.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUseCaseImpl implements EmployeeUseCase {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findEmployeeById(id);
    }
}
