package ch03.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch03.model.Cat;


@Controller
@SessionAttributes({"cat", "dog", "indexPageCat"})
@RequestMapping("/ch03")
public class Ch03Controller1 {
	
	@GetMapping("/index")
	public String mappings(Model model, HttpSession session) {
		Cat c = (Cat)model.getAttribute("cat");
		Dog d = new Dog();
		model.addAttribute(d);
		System.out.println("/ch03/index c=" + c);
		System.out.println("====================================");
		Enumeration<String> en = session.getAttributeNames();
		while (en.hasMoreElements()) {
			String name = en.nextElement();
			System.out.println(name + "-->" + session.getAttribute(name));
		}
		System.out.println("====================================");
		
		model.addAttribute("indexPageCat", c);
//		model.addAttribute("cat", c);
		
		return "ch03/index";
	}
	
	@ModelAttribute("cat")
	public Cat modelAttribute(Model model) {
		Cat c = new Cat();
		System.out.println("在Ch03Controller1類別內的@ModelAttribute修飾的方法中,新建Cat物件=" + c);
		return c;
	}
}
 