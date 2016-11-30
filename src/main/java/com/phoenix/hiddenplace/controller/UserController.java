package com.phoenix.hiddenplace.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.phoenix.hiddenplace.domain.User;
import com.phoenix.hiddenplace.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Inject
	private UserService service;

	@RequestMapping(value = "/userInsertView", method = RequestMethod.GET)
	public void insertGET() throws Exception {

		System.out.println("회원가입 컨트롤러에용");

	}

	@RequestMapping(value = "/userInsertView", method = RequestMethod.POST)
	public String insert(User user, RedirectAttributes rttr) throws Exception {

		System.out.println(user.toString());

		service.create(user);

		rttr.addFlashAttribute("result", "isSuccess");

		return "/views/user/userInsertView";

	}

}
