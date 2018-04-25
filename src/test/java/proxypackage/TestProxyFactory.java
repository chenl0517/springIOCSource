package proxypackage;

import org.springframework.aop.framework.ProxyFactory;

import com.gc.proxy.IService;
import com.gc.proxy.IServiceImpl;

public class TestProxyFactory {
	public static void main(String[] args) {
		ProxyFactory pf=new ProxyFactory();
		
		//pf.setInterfaces(IService.class);
		pf.setTarget(new IServiceImpl());
		
		IService service=(IService) pf.getProxy();
		System.out.println(service.getClass());
		service.say();
	}

}
