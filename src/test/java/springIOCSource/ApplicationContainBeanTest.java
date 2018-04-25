package springIOCSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gc.pojo.User;

public class ApplicationContainBeanTest {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext_containBean.xml");
		User user=app.getBean("usera", User.class);
		System.out.println(user.getName());
//		String[] result=app.getAliases("bb");
//		for(String re:result){
//			System.out.println(re);
//		}
	}

}
