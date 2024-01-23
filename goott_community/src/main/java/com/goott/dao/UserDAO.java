package com.goott.dao;

import java.util.List;

import com.goott.vo.UserVO;

public interface UserDAO {
	
	List<UserVO> selectAllUser();
}
