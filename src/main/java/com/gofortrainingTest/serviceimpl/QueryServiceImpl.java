package com.gofortrainingTest.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.Query;
import com.gofortrainingTest.repository.QueryRepository;
import com.gofortrainingTest.service.QueryService;


@Service
@Transactional
public class QueryServiceImpl implements QueryService{

	@Autowired
	private QueryRepository queryRepository;
	
	public Query saveQuery(Query query) {
		try {
			return queryRepository.save(query);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Query> queryList(){
		try {
			return queryRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
