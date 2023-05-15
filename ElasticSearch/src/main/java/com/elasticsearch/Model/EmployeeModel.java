package com.elasticsearch.Model;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName = "employee")
@Data
public class EmployeeModel {

	private long id;
	private String firstname;
	private String lastname;
	private String sallary;
	private String empid;

}
