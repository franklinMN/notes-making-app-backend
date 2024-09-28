package com.thefmn13.notes_making_app_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class NotesMakingAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesMakingAppBackendApplication.class, args);
	}

}
