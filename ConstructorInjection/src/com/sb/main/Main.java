package com.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sb.beans.Employee;

public class Main {
public static void main(String[] args) {
	
	String config_file_loc="/com/sb/resources/applicationcontext.xml";
	ApplicationContext context =new ClassPathXmlApplicationContext(config_file_loc);
	
         Employee emp=(Employee)context.getBean("empId");
         emp.display();
	
}
}
