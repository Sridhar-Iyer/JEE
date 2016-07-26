package edu.practice;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	private static Logger log = Logger.getLogger(StudentMain.class.getName());

	public static void main(String[] args) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student studentObject = (Student)context.getBean("student");
		System.out.println(studentObject);
		log.info(studentObject);
	}
}
