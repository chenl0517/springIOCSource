package com.gc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:autowired.xml"})
public class MySpringTest {
	@Resource
	private Student stu;
	@Resource
	private Teacher tec;
	
	@Test
	public void testStu(){
		tec.say();
	}
}
