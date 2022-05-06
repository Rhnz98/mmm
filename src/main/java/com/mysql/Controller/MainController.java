package com.mysql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mysql.Entity.User;
import com.mysql.Repository.UserRepository;

@Controller
public class MainController {
	@Autowired
	UserRepository userRepository;
@GetMapping("web")
public String show() {
	return "form";
}

@PostMapping("process")
public String formhandling(User user) {
	userRepository.save(user);
	return"login";
}
}
