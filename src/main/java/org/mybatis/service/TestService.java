package org.mybatis.service;

import org.mybatis.entity.TestEntity;

public interface TestService {

	public TestEntity selectOne(int id);
	
	public TestEntity selectOne2(int id);

}
