package ch04.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("ShoppingCart")
@RequestMapping("/ch04")
public class Ch04Controller4 {
	
	@GetMapping("/fourthPage")
	public String thirdPage(Model model, HttpServletRequest request) {
		System.out.println(999);
		return "ch04/fourthPage";	
	}

}
 