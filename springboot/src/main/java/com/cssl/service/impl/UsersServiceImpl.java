package com.cssl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	
	
	public UsersServiceImpl() {
		System.out.println("UsersServiceImpl无参构造："+this);
	}

	@Autowired
	private UsersDao udao;	
	

	@Override
	public boolean saveUsers(Users user) {
		System.out.println("UsersServiceImpl saveUsers...");
				
		if(udao.insertUsers(user)>0) {			
			return true;
		}
			
		return false;
	}

	@Override
	public int deleteById(int id) {
		System.out.println("UsersServiceImpl deleteById...");
		if(id==0)
			throw new RuntimeException("自己抛的异常。。。");
		return id;
	}

	@Override
	public List<Users> findAll(int page,int rows) {
		PageHelper.startPage(page, rows);
		return udao.select();
	}

}
