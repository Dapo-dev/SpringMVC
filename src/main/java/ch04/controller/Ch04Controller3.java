package ch04.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch04.model.MemberBean;
import ch04.model.ShoppingCart;


@Controller
@SessionAttributes({"ShoppingCart", "memberBean"})
@RequestMapping("/ch04")
public class Ch04Controller3 {
	
	@GetMapping("/thirdPage")
	public String thirdPage(Model model, HttpServletRequest request) {
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		System.out.println("3rd/cart=" + cart);
		MemberBean member = (MemberBean) model.getAttribute("memberBean");
		System.out.println("3rd/member=" + member);
		return "ch04/thirdPage";	
	}

}
 