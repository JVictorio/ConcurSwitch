package com.concur;

import com.concur.model.Application;
import com.concur.repo.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurSwitchApplication {

	@Autowired
	private ApplicationRepository applicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConcurSwitchApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		// fetch all customers
		System.out.println("Application Jenkin found with findAll():");
		System.out.println("-------------------------------");
		for (Application application : applicationRepository.findAll()) {
			System.out.println(application);
		}
		System.out.println();

		System.out.println("Application found with findByAppName('travel'):");
		System.out.println("--------------------------------");
		for (Application application : applicationRepository.findByAppName("travel")) {
			System.out.println(application);
		}

		System.out.println("Application found with findByAppNameAndEnv('travel', 'BAT'):");
		System.out.println("--------------------------------");
		for (Application application : applicationRepository.findByAppNameAndEnvironment("travel", "BAT")) {
			System.out.println(application);
		}

		System.out.println("Application found with findByCustomQuery('expense', 'BAT'):");
		System.out.println("--------------------------------");
		for (Application application : applicationRepository.findByCustomQuery("expense", "BAT")) {
			System.out.println(application);
		}

		System.out.println("Application found with findByAppServer('expense', 'localhost'):");
		System.out.println("--------------------------------");
		for (Application application : applicationRepository.findByAppServer("expense", "http://localhost:8080")) {
			System.out.println(application);
		}
	}
	*/
}
