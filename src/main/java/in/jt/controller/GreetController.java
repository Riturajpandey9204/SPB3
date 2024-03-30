package in.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet1")
	public String getGreetInfo1() {
		
		return "greet";
	}
	
	@GetMapping("/greet2")
	public String getGreetInfo2() {
		int a = 10/0; //java.lang.ArithmeticException
		return "greet2";
	}
	
	@ExceptionHandler(value = java.lang.ArithmeticException.class )
	public String handleNullPointerException(Model model) {
		String errMessage = "Dont Enter Zero As Denominator...!!!!";
		model.addAttribute("errMsg", errMessage);
		return "error2";
	}
}
