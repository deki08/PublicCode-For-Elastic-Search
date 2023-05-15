package com.elasticsearch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elasticsearch.DTO.EmployeeDTO;
import com.elasticsearch.Model.Employee;
@Repository
public interface EmployeeRespo extends JpaRepository<Employee, Long> {

	Employee save(EmployeeDTO toEmployee);

}
