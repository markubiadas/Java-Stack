package com.markubiadas.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String send(
			@RequestParam(value="years") Integer years,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="occupation") String occupation,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="message") String message,
			HttpSession session
			) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("occupation", occupation);
		session.setAttribute("thing", thing);
		session.setAttribute("message", message);
		return "redirect:/show";
	
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
	
}
