package com.salankiv.cicmiscanner;

import com.salankiv.cicmiscanner.model.IataAirline;
import com.salankiv.cicmiscanner.model.IataAirlineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicmiscannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicmiscannerApplication.class, args);
	}
}
