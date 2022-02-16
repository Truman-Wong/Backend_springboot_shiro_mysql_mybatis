package com.example.studentmanagement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ControllerAdvice
@SpringBootApplication
public class StudentManagementApplication {


//	@Bean
//	public Realm realm(){
//		PropertiesRealm realm = new PropertiesRealm();
//		return realm;
//	}
//    @Bean
//	public ShiroFilterChainDefinition shiroFilterChainDefinition(){
//		DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//		chainDefinition.addPathDefinition("**", "autheBasic");
//		return chainDefinition;
//	}




	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
