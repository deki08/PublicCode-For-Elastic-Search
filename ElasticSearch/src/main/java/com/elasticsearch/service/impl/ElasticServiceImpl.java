package com.elasticsearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elasticsearch.DTO.EmployeeDTO;
import com.elasticsearch.Mapper.EmpMapper;
import com.elasticsearch.Model.Employee;
import com.elasticsearch.Repository.EmployeeRespo;
import com.elasticsearch.Repository.Elastic.ElasticRepos;
import com.elasticsearch.service.ElasticService;
@Service
public class ElasticServiceImpl implements ElasticService {
	
	@Autowired
	private ElasticRepos elasticRepos;
	
	@Autowired
	private EmployeeRespo employeeRespo;
	
	@Autowired
	public ElasticServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}

	private final EmpMapper empMapper;
	
	@Override
	public EmployeeDTO Save(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		Employee employee = this.employeeRespo.save(this.empMapper.ToEmployee(dto));
		return empMapper.toEmployeeDTO(employee);
	}

	@Override
	public List<EmployeeDTO> findAll() {
		// TODO Auto-generated method stub
		return this.empMapper.toEmpolyeesDTOs(this.employeeRespo.findAll());
	}
	
	

}
