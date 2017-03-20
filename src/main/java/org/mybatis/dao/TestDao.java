package org.mybatis.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.mybatis.entity.TestEntity;

public interface TestDao {

	public TestEntity selectOne(int id) ;

	@Select("SELECT * FROM TEST WHERE ID=#{id}")
	public TestEntity selectOne2(int id);
	
	@Insert("insert into test (id, name) values(#{id}, #{name})")
	@SelectKey(statement="call next value for TestSequence", keyProperty="id", before=true, resultType=int.class)
	int insertEntity(TestEntity test);

}
