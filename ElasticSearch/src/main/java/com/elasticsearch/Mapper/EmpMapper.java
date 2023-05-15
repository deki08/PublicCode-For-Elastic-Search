package com.elasticsearch.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.elasticsearch.DTO.EmployeeDTO;
import com.elasticsearch.Model.Employee;

@Mapper(componentModel = "spring")
public interface EmpMapper {

	EmployeeDTO ToEmployee(EmployeeDTO dto);

	EmployeeDTO toEmployeeDTO(Employee employee);

	List<EmployeeDTO> toEmpolyeesDTOs(List<Employee> findAll);

}
