package ch04.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch04.model.BookBean;
import ch04.model.MemberBean;
import ch04.model.ShoppingCart;


@Controller
@SessionAttributes({"ShoppingCart", "memberBean"})
@RequestMapping("/ch04")
public class Ch04Controller2 {

	@GetMapping("/secondPage")
	public String nextPage(Model model, HttpServletRequest request) {
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		System.out.println("2nd/cart=" + cart);
		MemberBean member = (MemberBean) model.getAttribute("memberBean");
		System.out.println("2nd/member=" + member);
		return "ch04/secondPage";
	}
	@ModelAttribute
	public BookBean modelAttribute(HttpServletRequest req, Model model) {
		BookBean bb = new BookBean("黃鈺琦", "FLASHCS4互動網頁設計", 550.0);
		return bb;
	}
}
 