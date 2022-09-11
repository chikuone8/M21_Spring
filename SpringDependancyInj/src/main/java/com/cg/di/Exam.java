package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1=a.getBean("s1",Student.class);
		s1.display();
		
	}

}