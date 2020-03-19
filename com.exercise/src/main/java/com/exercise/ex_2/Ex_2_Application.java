package com.exercise.ex_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan("com.exercise.*")
@SpringBootApplication

public class Ex_2_Application{
   
	public static void main(String args[]) {
		
    	SpringApplication.run(Ex_2_Application.class, args);
   
	}
}