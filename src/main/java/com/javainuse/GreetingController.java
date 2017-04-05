package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping("/welcome.html")
	public ModelAndView greeting() {
		return new ModelAndView("welcome");
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/blog.html")
	public ModelAndView blogi(ModelMap model) {
		
		model.addAttribute("randomNumber", Math.random());
		return new ModelAndView("blog","blankModelName", model);
		// TODO Auto-generated constructor stub
	}
}
