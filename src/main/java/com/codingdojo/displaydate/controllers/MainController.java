package com.codingdojo.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		String datePattern = "EEEEE, 'the' dd 'of' MMMMM, yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern, Locale.ENGLISH);
		String date = dateFormat.format(new Date());
		model.addAttribute("date", date);
		return "date.jsp";
		
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		String timePattern = "hh:mm a";
		SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern, Locale.ENGLISH);
		String time = timeFormat.format(new Date());
		model.addAttribute("time", time);
		return "time.jsp";
		
	}

}
