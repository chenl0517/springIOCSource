package com.gc.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bhello")
public class HelloService implements InitializingBean{
	 //required要跟句主类的模式来，如果主类不延迟加载，此处即使是required=false也无效
	@Autowired(required=false)
	private IHelloService ahello;
	public HelloService(){
		System.out.println("==========bhello===constructor===========");
	}
	
	public void say(String name){
		System.out.println("==============================="+name);
	}

	public void afterPropertiesSet() throws Exception {
        System.out.println("========afterPropertiesSet============");		
	}

}
