package ch03.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ch03.model.Cat;


@Controller
@SessionAttributes({"cat","mouse"})
@RequestMapping("/ch03")
public class Ch03Controller9 {

	@Autowired
	ServletContext context;
	
	
	@GetMapping("/SessionStatus_setComplete")
	public String SessionStatus_setComplete(SessionStatus status) {
		System.out.println("執行status.setComplete();");
		status.setComplete();
		return "ch03/thirdPage";
	}
	// 了解Spring MVC中，Session#invalidate()方法對@SessionAttributes的影響 
	@GetMapping("/SessionInvalidate")
	public String delete(HttpSession session) {
		Cat c0 = (Cat)session.getAttribute("cat");
		System.out.println("執行session.invalidate()之前的Cat物件=" + c0);
		System.out.println("執行session.invalidate();");
		session.invalidate();
		try {
			Cat c1 = (Cat)session.getAttribute("cat");
			System.out.println("執行session.invalidate()之後的Cat物件=" + c1);
		} catch(Exception e) {
			System.out.println("已經執行session.invalidate()後就無法再存取Session內的屬性物件");
		}
		return "ch03/thirdPage";
	}
	
	@GetMapping("/inspectSession")
	public String inspect(HttpSession session, Model model) {
		Cat c1 = (Cat) model.getAttribute("cat");
		System.out.println("in inspectSession, through model, cat=" + c1);
		Cat c2 = (Cat) session.getAttribute("cat");
		System.out.println("in inspectSession, through session, cat=" + c2);
		return "ch03/thirdPage";
	}
	
//	@ModelAttribute
//	public Cat modelAttribute(HttpServletRequest req, Model model) {
//		Cat c = new Cat();
//		System.out.println("在Ch03Controller9類別內的@ModelAttribute修飾的方法中,新建Cat物件=" + c);
//		return c;
//	}
}
 