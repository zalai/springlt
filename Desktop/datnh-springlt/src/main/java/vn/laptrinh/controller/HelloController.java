// ----------------------------------------------------------------------------
// Copyright 2014, LAPTRINH.VN.
// All rights reserved
// ----------------------------------------------------------------------------
// Change History:
//  2014.08.17  datnh
//     - Initial release
// ----------------------------------------------------------------------------
package vn.laptrinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class HelloController {

	/**
	 * Nhan request /hello, xu ly thong tin
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String helloworld(Model model) {
		
		model.addAttribute("name", "Laptrinh.vn");
		
		return "hello";
	}

}
