package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
		System.out.println("testing");

	}

    //aaa("Hello World");
}
