package org.mybatis;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试基类
 *
 */
@WebAppConfiguration
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
 "classpath*:applicationContext-env.xml","classpath*:applicationContext-data.xml","classpath*:applicationContext-servlet.xml"}) 
public class AbstractSpringTest {

	/**
	 * 日志打印
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
}
