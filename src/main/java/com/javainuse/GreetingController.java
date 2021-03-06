package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetingController {	
	@RequestMapping("/welcome.html")
	public ModelAndView greeting(ModelMap model) {
		model.addAttribute("mylist", BootGradleApplication.getMylist() );
	
		return new ModelAndView("welcome","blankModelName", model);
		// TODO Auto-generated constructor stub
	}
		
	@RequestMapping("/blog.html")
	public ModelAndView blogi(ModelMap model) {
		
		model.addAttribute("autor", BootGradleApplication.getAutor());
		model.addAttribute("pealkiri", BootGradleApplication.getPealkiri());
		model.addAttribute("tekst", BootGradleApplication.getTekst());
		model.addAttribute("autor1", BootGradleApplication.getAutor1());
		model.addAttribute("pealkiri1", BootGradleApplication.getPealkiri1());
		model.addAttribute("tekst1", BootGradleApplication.getTekst1());
		return new ModelAndView("blog","blankModelName", model);
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/pakkumised.html")
	public ModelAndView pakkumised() {
		return new ModelAndView("pakkumised");
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/meist.html")
	public ModelAndView meist() {
		return new ModelAndView("meist");
		// TODO Auto-generated constructor stub
	}
}
