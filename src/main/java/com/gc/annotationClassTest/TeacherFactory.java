package com.gc.annotationClassTest;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import(value=Studentconfig.class)
public class TeacherFactory {
	@Bean
	public Teacher teacher(){
		Teacher te=new Teacher();
		//te.setStudent(student);
		return te;
	}
	@Bean
	public Teacher teacher2(Student student){
		Teacher te=new Teacher();
		te.setStudent(student);
		return te;
	}
	
}
