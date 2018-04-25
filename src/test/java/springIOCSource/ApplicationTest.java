package springIOCSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath*:sonapplicationContext.xml");
	}

}
