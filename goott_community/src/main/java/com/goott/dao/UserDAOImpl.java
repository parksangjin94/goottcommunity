package com.goott.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.goott.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	SqlSession ses;
	
	private static String ns = "com.goott.mappers.UserMapper";
	
	@Override
	public List<UserVO> selectAllUser() {
		System.out.println("daoImpl 호출");
		return ses.selectList(ns + ".selectAllUser");
	}
	
}
