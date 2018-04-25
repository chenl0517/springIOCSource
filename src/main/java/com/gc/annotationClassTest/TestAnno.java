package com.gc.annotationClassTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {
     public static void main(String[] argss){
    	 ApplicationContext ac=new AnnotationConfigApplicationContext(TeacherFactory.class);
    	// TeacherFactory le= ac.getBean("TeacherFactory",TeacherFactory.class);
    	 Teacher le= ac.getBean("teacher2",Teacher.class);
    	 System.out.println(le);
     }
}
