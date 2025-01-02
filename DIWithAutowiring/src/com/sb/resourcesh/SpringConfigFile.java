package com.sb.resourcesh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sb.beans.Address;
import com.sb.beans.Student;
import com.sb.beans.Subjects;

@Configuration
public class SpringConfigFile 
{
	@Bean
    public Address createAddrObj() {
		
    	Address addr=new Address(); 	
    	addr.setHouseno(123);
    	addr.setCity("Pune");
    	addr.setPincode(212123);
    	
    	return addr;
    }
	@Bean
	public Subjects createSubObj() {
		Subjects sub=new Subjects();
		List<String> subjects_list=new ArrayList<>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");
		
		sub.setSubjects(subjects_list);
		
		return sub;		
	}
	@Bean
    public Student createStdObj() {
		
	Student std=new Student();
	std.setName("Sangita");
	std.setRollno(126);
	//std.setAddress(createAddrObj());// Manually DI
	//std.setSubjects(createSubObj());// manually DI
	return std;
}
}