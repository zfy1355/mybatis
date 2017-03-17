package org.mybatis.service.impl;

import org.mybatis.dao.TestDao;
import org.mybatis.entity.TestEntity;
import org.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao dao;
	
	public TestEntity selectOne(int id){
		return dao.selectOne(id);
	};

}
