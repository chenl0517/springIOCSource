package com.gc.annotationClassTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfig {
	Studentconfig(){
		
	}
	
   @Bean
   public Student student(){
	   return new Student();
   }
}
