package dev.chonaso.demo.springboot_sample1.adapters.gateways.db;

import dev.chonaso.demo.springboot_sample1.domain.model.Employee;
import dev.chonaso.demo.springboot_sample1.domain.repository.EmployeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryCustom extends EmployeeRepository, JpaRepository<Employee, Long> {
    @Override
    Employee findEmployeeById(Long id);
}
