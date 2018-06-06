package com.file.report.reportservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping
	public void test() {
		UserRole role=new UserRole();
		role.setRole("jay");
		userRepo.save(role);
		
	}

}
