package org.mybatis.dao;

import org.apache.ibatis.annotations.Select;
import org.mybatis.entity.TestEntity;

public interface TestDao {

	public TestEntity selectOne(int id) ;

	@Select("SELECT * FROM TEST WHERE ID=#{id}")
	public TestEntity selectOne2(int id);

}
