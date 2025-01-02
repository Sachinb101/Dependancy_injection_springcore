package com.sb.resourcesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sb.beans.Address;
import com.sb.beans.Student;

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
public Student createStdObj() {
		
	Student std=new Student();
	
	std.setName("Sangita");
	std.setRollno(126);
    std.setAddress(createAddrObj());// Manually DI
	
	return std;
}
}