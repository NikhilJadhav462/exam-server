package com.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.users.entity.Department;
import com.users.entity.RestTemplateVo;
import com.users.entity.User;
import com.users.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RestTemplate restTemplate;

	public User addUser(User user) {
		return userRepo.save(user);
	}

	
	public RestTemplateVo getUserWithDepartment(Long userId) {
		RestTemplateVo vo = new RestTemplateVo();
		User user = userRepo.findById(userId).get();
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/get/"+user.getId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
