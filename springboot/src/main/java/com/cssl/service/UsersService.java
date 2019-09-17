package com.cssl.service;

import java.util.List;

import com.cssl.pojo.Users;

public interface UsersService {
	
	public boolean saveUsers(Users user) ;
	
	public List<Users> findAll(int page,int rows);
	
	public int deleteById(int id);

}
