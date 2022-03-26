package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.users.entity.RestTemplateVo;
import com.users.entity.User;
import com.users.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/{userId}")
	public RestTemplateVo getUserWithDepartment(@PathVariable Long userId) {
		return userService.getUserWithDepartment(userId);
	}

}
