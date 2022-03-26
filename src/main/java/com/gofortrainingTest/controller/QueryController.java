package com.gofortrainingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.Query;
import com.gofortrainingTest.service.QueryService;


@CrossOrigin("*")
@RestController
public class QueryController {

	@Autowired
	private QueryService queryService;
	
	@PostMapping(value = "/saveQuery")
	public Query saveQuery(@RequestBody Query query) {
		try {
			return queryService.saveQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/queryList")
	public List<Query> queryList(){
		try {
			return queryService.queryList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
