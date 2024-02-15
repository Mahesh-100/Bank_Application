package com.bank.BankApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/demo")
	public String welcome(@RequestParam(name="str") String str) {
		if(str.equals("hi")) {
		return "Welcome";
		}else
	 {
		return "bye";	
		}
}
}
