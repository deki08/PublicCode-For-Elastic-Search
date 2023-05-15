package com.elasticsearch.service;

import java.util.List;

import com.elasticsearch.DTO.EmployeeDTO;

public interface ElasticService {

	EmployeeDTO Save(EmployeeDTO dto);

	List<EmployeeDTO> findAll();

}
