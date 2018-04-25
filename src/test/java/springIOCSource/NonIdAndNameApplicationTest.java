package springIOCSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gc.pojo.User;

public class NonIdAndNameApplicationTest {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("nonIdAndNameapplicationContext.xml");
		//User user=app.getBean("com.gc.pojo.User#0", User.class);
		//System.out.println(user.getName());
		
	}
}
