package com.users.service;

import com.users.entity.RestTemplateVo;
import com.users.entity.User;

public interface UserService {

	User addUser(User user);
	RestTemplateVo getUserWithDepartment(Long userId);

}
