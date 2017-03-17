package org.mybatis.service;

import org.junit.Assert;
import org.junit.Test;
import org.mybatis.AbstractSpringTest;
import org.mybatis.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;


public class TestServiceTest extends AbstractSpringTest{
	
	@Autowired
	private TestService service ;
	
	@Test
	public void  testSelectOne(){
		TestEntity test = service.selectOne(1);
		Assert.assertNotNull(test);
	}
	
	@Test
	public void  testSelectOne2(){
		TestEntity test = service.selectOne2(1);
		Assert.assertNotNull(test);
	}

}
