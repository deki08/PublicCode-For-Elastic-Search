package com.elasticsearch.Repository.Elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elasticsearch.Model.EmployeeModel;

@Repository
public interface ElasticRepos extends ElasticsearchRepository<EmployeeModel, Long> {

}
