package in.nareshit.suman.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring Boot App");
		System.out.println("Welcome to Spring Boot App");
	}
}
