package com.shad.displaydate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model d) {
		LocalDate date = java.time.LocalDate.now();
		String localDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		
		d.addAttribute("date", localDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model t) {
		
		LocalTime time = java.time.LocalTime.now();
		String localTime = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
		t.addAttribute("time", localTime);
		return "time.jsp";
	}
}
