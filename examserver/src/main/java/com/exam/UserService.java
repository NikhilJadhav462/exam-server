package com.exam;

import java.util.Set;
import com.exam.model.User;
import com.exam.model.User_Role;

public interface UserService {

	User createUser(User user, Set<User_Role> userRole);

	User getUser(String userName);

	void deleteUser(Long id);

}
