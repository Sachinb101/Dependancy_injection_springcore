package com.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.beans.Student;
import com.sb.resourcesh.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
	Student std=context.getBean(Student.class);
	std.display();
	
}
}
