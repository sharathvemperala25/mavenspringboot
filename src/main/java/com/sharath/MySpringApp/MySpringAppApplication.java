package com.sharath.MySpringApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MySpringAppApplication  {

	public static void main(String[] args)
	{
		SpringApplication.run(MySpringAppApplication.class, args);
		System.out.println("hi world");
	}

}

