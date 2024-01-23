package com.goott.controller.psj;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.service.UserService;
import com.goott.vo.UserVO;

@RestController
@RequestMapping("/users")
public class BoardRestController {
	
	@Inject 
	private UserService userService;
	
	@GetMapping("")
	public String users() {
		System.out.println("restcontroller 호출");
		List<UserVO> result = userService.selectAllUser();
		System.out.println(result.toString());
		return "";
	}
	
	
	@GetMapping("/users/{userId}")
	public String user(@PathVariable("id") String userId) {
		System.out.println(userId);
			return "";
	}
	
}
