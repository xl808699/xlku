package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.Users;

//@Mapper
public interface UsersDao {
	
	public int insertUsers(Users user);
	
	public List<Users> select();

}
