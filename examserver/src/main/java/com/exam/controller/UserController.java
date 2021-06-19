package com.exam.controller;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exam.UserService;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.User_Role;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		Set<User_Role> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleName("NORMAL");
		User_Role userRole = new User_Role();
		userRole.setRole(role);
		userRole.setUser(user);
		return userService.createUser(user, roles);
	}

	@GetMapping("/{userName}")
	public User getUser(@PathVariable String userName) {
		return userService.getUser(userName);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
