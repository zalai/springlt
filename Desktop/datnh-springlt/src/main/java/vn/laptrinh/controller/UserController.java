// ----------------------------------------------------------------------------
// Copyright 2014, LAPTRINH.VN.
// All rights reserved
// ----------------------------------------------------------------------------
// Change History:
//  2014.08.17  datnh
//     - Initial release
// ----------------------------------------------------------------------------
package vn.laptrinh.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.laptrinh.domain.User;
import vn.laptrinh.service.UserServiceLocal;

/**
 * <p>
 * Title: SpringLT
 * </p>
 * <p>
 * Copyright: Copyright (c) by laptrinh.vn 2014
 * </p>
 * 
 * @author laptrinh.vn
 * @version 0.1
 */
@Controller
public class UserController {

	@Autowired
	private UserServiceLocal userService;

	@RequestMapping("/user/{id}")
	public String helloworld(@PathVariable long id, Model model) {
		
		User user = userService.getByUserId(id);
		
		model.addAttribute("user", user);
		
		return "user";
	}

	@RequestMapping("/user/list")
	public String list(Model model, Principal principal) {
		String userName = principal.getName();
		
		SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		System.out.println("User Name: " + userName);

		List<User> userList = userService.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "userList";
	}

	@RequestMapping(value = "/user/form", method = RequestMethod.GET)
	public String formGet(Model model, Integer id) {
		
		User user;
		
		// id != null -> edit form
		if (id != null) {
			user = userService.getByUserId(id);
		} else {
			user = new User();
		}
		
		model.addAttribute("user", user);
		
		return "userForm";
	}

	@RequestMapping(value = "/user/form", method = RequestMethod.POST)
	public String formPost(Model model, @Valid User user, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			
			System.out.println("Error. Returning userForm page");
			
			model.addAttribute("user", user);
			
			return "userForm";
		}
		
		// id != null -> edit form
		if (user.getId() == null) {
			
			userService.insert(user);
		} else {
			
			userService.updateByPrimaryKey(user);
		}
		
		return "redirect:list.html";
	}
	
}
