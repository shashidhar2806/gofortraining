package com.gofortrainingTest.service;

import java.util.List;

import com.gofortrainingTest.model.Query;


public interface QueryService {
	
	public Query saveQuery(Query query);
	
	public List<Query> queryList(); 

}
