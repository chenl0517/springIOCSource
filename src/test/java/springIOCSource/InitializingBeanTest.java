package springIOCSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanTest {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("initTestApplicationcontext.xml");
		//Student stu=app.getBean("stu", Student.class);
		
				
	}

}
