package com.concur;

import com.concur.model.Jenkins;
import com.concur.repo.JenkinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurSwitchApplication implements CommandLineRunner {

	@Autowired
	private JenkinsRepository jenkinsRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConcurSwitchApplication.class, args);
		System.exit(0);
	}

	@Override
	public void run(String... args) throws Exception {
		// fetch all customers
		System.out.println("Application Jenkin found with findAll():");
		System.out.println("-------------------------------");
		for (Jenkins jenkins : jenkinsRepository.findAll()) {
			System.out.println(jenkins);
		}
		System.out.println();

		System.out.println("Application found with findByAppName('travel'):");
		System.out.println("--------------------------------");
		for (Jenkins jenkins : jenkinsRepository.findByAppName("travel")) {
			System.out.println(jenkins);
		}

		System.out.println("Application found with findByAppNameAndEnv('travel', 'BAT'):");
		System.out.println("--------------------------------");
		for (Jenkins jenkins : jenkinsRepository.findByAppNameAndEnvironment("travel", "BAT")) {
			System.out.println(jenkins);
		}

		System.out.println("Application found with findByCustomQuery('expense', 'BAT'):");
		System.out.println("--------------------------------");
		for (Jenkins jenkins : jenkinsRepository.findByCustomQuery("expense", "BAT")) {
			System.out.println(jenkins);
		}

		System.out.println("Application found with findByAppServer('expense', 'localhost'):");
		System.out.println("--------------------------------");
		for (Jenkins jenkins : jenkinsRepository.findByAppServer("expense", "http://localhost:8080")) {
			System.out.println(jenkins);
		}
	}
}
