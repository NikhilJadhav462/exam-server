package com.exam;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exam.model.User;
import com.exam.model.User_Role;
import com.exam.repo.RoleRepo;
import com.exam.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Autowired
	RoleRepo roleRepo;

	@Override
	public User createUser(User user, Set<User_Role> userRole) {
		User local = userRepo.findByUserName(user.getUserName());
		if (local != null) {
			System.out.println("USER ALREADY PRESENT");
		} else {
			for (User_Role userRoles : userRole) {
				roleRepo.save(userRoles.getRole());
			}
			user.getRoles().addAll(userRole);
			local = userRepo.save(user);
		}
		return local;
	}

	@Override
	public User getUser(String userName) {
		return userRepo.findByUserName(userName);
	}
	
	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
