package springIOCSource;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest2 {
	public static void main(String[] args) {
		DefaultListableBeanFactory dbf=new XmlBeanFactory(new ClassPathResource("applicationContext_containBean.xml"));
		BeanDefinition af=dbf.getBeanDefinition("usera");
	    String metavalue=	(String) af.getAttribute("meta");
	    System.out.println(metavalue);
	}

}
