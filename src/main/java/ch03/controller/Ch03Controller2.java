package ch03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch03.model.Cat;


@Controller
@SessionAttributes("cat")
@RequestMapping("/ch03")
public class Ch03Controller2 {

	@GetMapping("/secondPage")
	public String nextPage(Model model, HttpServletRequest request) {
		Cat c = (Cat)model.getAttribute("cat");
		System.out.println("/ch03/secondPage c=" + c);
		model.addAttribute("secondPageCat", c);
		return "ch03/secondPage";
	}
//	@ModelAttribute("cat")
//	public Cat modelAttribute(HttpServletRequest req, Model model) {
//		Cat c = new Cat();
//		System.out.println("在Ch03Controller2類別內的@ModelAttribute修飾的方法中,新建Cat物件=" + c);
//		return c;
//	}
}
 