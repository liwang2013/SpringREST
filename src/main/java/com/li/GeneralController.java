package com.li;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class GeneralController {

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		
		model.addAttribute("msg", "Welcome to Spring!");
		
		// return WEB-INF/display/jsp
		return "display";
	}

	@RequestMapping(value = "/echo/{msg}", method = RequestMethod.GET)
	public String displayMessage(@PathVariable String msg, ModelMap model) {
		
		model.addAttribute("msg", msg);
		return "display";
	}

}