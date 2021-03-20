package dev.chonaso.demo.springboot_sample1.domain.repository;

import dev.chonaso.demo.springboot_sample1.domain.model.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(Long id);
}
