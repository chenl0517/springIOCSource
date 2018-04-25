package springIOCSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gc.pojo.User;

public class ParentAndSonApplicationTest {
	public static void main(String[] args) {
		ApplicationContext appparent=new ClassPathXmlApplicationContext("parentapplicationContext.xml");
		
		ApplicationContext appson=new ClassPathXmlApplicationContext(new String[]{"sonapplicationContext.xml"},appparent);
		
		//如果存在父级容器，先从当前容器中包含要查找的beanname，则从当前容器获取，否则直接从父级容器获取
		User user=appson.getBean("usera", User.class);
		
		System.out.println(user.getId());
		
	}

}
