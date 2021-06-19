package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.User_Role;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Running App");

		User user = new User();
		user.setFirstName("Nikhil");
		user.setLastName("Jadhav");
		user.setPassword("ABC");
		user.setUserName("NIKJ15234");
		user.setProfile("profile.png");
		user.setEmail("nikhiljadhavp64@gmail.com");
		user.setEnabled(true);

		Role role1 = new Role();
		role1.setRoleId(44);
		role1.setRoleName("ADMIN");

		

		Set<User_Role> userRoles = new HashSet<>();
		User_Role roles = new User_Role();
		roles.setRole(role1);
		roles.setUser(user);
		
		userRoles.add(roles);
		
		
		User user1 = userService.createUser(user, userRoles);
		System.out.println("Username :"+user1.getId());*/
	}

}
