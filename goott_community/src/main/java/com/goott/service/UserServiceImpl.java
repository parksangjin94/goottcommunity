package com.goott.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.goott.dao.UserDAO;
import com.goott.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject 
	UserDAO userDAO;
	
	@Override
	public List<UserVO> selectAllUser() {
		System.out.println("serviceImpl호출");
		return userDAO.selectAllUser();
	}

}
