package com.example.jwtdemo2;

import com.example.jwtdemo2.entity.User;
import com.example.jwtdemo2.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtDemo2Application {

	@Autowired
	private UserRepo userRepo;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101, "user1", "password1", "email1"),
				new User(102, "user2", "password2", "email2"),
				new User(103, "user3", "password3", "email3"),
				new User(104, "user4", "password4", "email4")
		).collect(Collectors.toList());
		userRepo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtDemo2Application.class, args);
	}

}
