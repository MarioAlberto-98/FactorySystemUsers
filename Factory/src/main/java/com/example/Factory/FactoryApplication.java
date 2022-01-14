package com.example.Factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {

		FactoryPosition type =new FactoryPosition();
		UsersPosition Tp=type.getPosition("PL");
		Tp.position();



	}

}
