package com.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elasticsearch.DTO.EmployeeDTO;
import com.elasticsearch.service.ElasticService;

@RestController
public class ElasticController {

	@Autowired
	private ElasticService elasticService;

	@PostMapping("/save")
	public ResponseEntity<EmployeeDTO> SaveEmp(@RequestBody EmployeeDTO dto) {
		return new ResponseEntity<EmployeeDTO>(elasticService.Save(dto), HttpStatus.OK);
	}

	@GetMapping("/find")
	public ResponseEntity<List<EmployeeDTO>> findall() {
		return new ResponseEntity<List<EmployeeDTO>>(elasticService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/check")
	public ResponseEntity<String> checkEndpoint() {
		return ResponseEntity.ok("Endpoint is working!");
	}

}
