package com.tistory.ospace.simplesecurity1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		MongoAutoConfiguration.class	
})
@EnableTransactionManagement
public class SimpleSecurity1Application {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SimpleSecurity1Application.class);
		springApplication.addListeners(new ApplicationPidFileWriter("app.pid"));
		springApplication.run(args);
	}
}
