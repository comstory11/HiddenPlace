package com.phoenix.hiddenplace.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phoenix.hiddenplace.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Inject
	private UserService service;

	
}
