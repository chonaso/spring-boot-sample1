package dev.chonaso.demo.springboot_sample1.usecases;

import dev.chonaso.demo.springboot_sample1.domain.model.Employee;

public interface EmployeeUseCase {
    Employee getEmployee(Long id);
}
