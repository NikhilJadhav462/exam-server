package com.exam.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	private String roleName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "role")
	private Set<User_Role> roles = new HashSet<>();

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User_Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<User_Role> roles) {
		this.roles = roles;
	}
	
	

}
