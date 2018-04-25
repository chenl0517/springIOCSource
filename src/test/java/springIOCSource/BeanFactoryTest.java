package springIOCSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.gc.BeanPostProcessor.MyBeanPostProcessor;
import com.gc.service.HelloService;

public class BeanFactoryTest {
	public static void main(String[] args) {
		
		ResourcePatternResolver rpr=new PathMatchingResourcePatternResolver();
		Resource resource=rpr.getResource("applicationContext.xml");
		
		BeanFactory bf=new XmlBeanFactory(resource);
		((DefaultListableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
//		User user=bf.getBean("usera", User.class);
//		System.out.println(user.getName());
		
		
		HelloService service=bf.getBean("helloService", HelloService.class);
		service.say("chenl");
	}
}
