package in.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("***********WELCOME CONTROLLER *********");
	}

	@GetMapping("/welcome1")
	public String getWelcomeMessage1() {
		String name1 = "Mr.Ahmed";
		int length = name1.length(); 
		System.out.println("Length of string is: "+length);
		return "welcome1"; // here welcome is presentation file name
	}
	
	@GetMapping("/welcome2")
	public String getWelcomeMessage2() {
		String name2 = null;
		int length = name2.length(); //java.lang.NullPointerException
		System.out.println("Length of string is: "+length);
		return "welcome1"; // here welcome is presentation file name
	}
	
	
	@ExceptionHandler(value = java.lang.NullPointerException.class )
	public String handleNullPointerException(Model model) {
		String errMessage = "Sorry For Inconvence....!!!! There is a problem at our side";
		model.addAttribute("errMsg", errMessage);
		return "error1";
	}
	
}
