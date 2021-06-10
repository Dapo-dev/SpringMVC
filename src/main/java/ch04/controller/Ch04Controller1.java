package ch04.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch04.model.BookBean;
import ch04.model.MemberBean;
import ch04.model.OrderItemBean;
import ch04.model.ShoppingCart;
import ch04.service.BookService;


@Controller
@SessionAttributes({"ShoppingCart", "memberBean"})
@RequestMapping("/ch04")
public class Ch04Controller1 {
	
	@Autowired
	BookService service;
	
	@GetMapping("/index")
	public String mappings(Model model) {
//      測試用		
//		Map<Integer, BookBean> map = (Map<Integer, BookBean>)model.getAttribute("allBooks");
//		System.out.println("map.size()=" + map.size());
//		System.out.println("map.get(1)=" + map.get(1));
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		System.out.println("1st/cart=" + cart);
		MemberBean member = (MemberBean) model.getAttribute("memberBean");
		System.out.println("1st/member=" + member);
		
		
		return "ch04/index";
	}
	
	
	@PostMapping("/addToCart")
	public String addToCart(Model model, 
		   @RequestParam Long bookId,
		   @RequestParam Integer qty, 
		   @RequestParam String page
			) {
		ShoppingCart cart = (ShoppingCart)model.getAttribute("ShoppingCart");
		BookBean bean = service.getBook(bookId);
		OrderItemBean oib = new OrderItemBean(null, bean, qty, 1.0);
		cart.addToCart(bookId, oib);
		return "ch04/" + page;
	}
	
	
	@ModelAttribute("ShoppingCart")
	public ShoppingCart createShopping(Model model) {
		ShoppingCart sc = new ShoppingCart();
		System.out.println("在Ch04Controller1類別內的@ModelAttribute修飾的方法中,新建ShoppingCart物件=" + sc);
		return sc;
	}
	@ModelAttribute
	public MemberBean createMemberBean(Model model) {
		MemberBean mb = new MemberBean("kitty2020", "林曉珍");
		System.out.println("1st mb=" + mb);
		return mb;
	}
	
	@ModelAttribute("allBooks")
	public Map<Long, BookBean> getAllBooks(Model model) {
		System.out.println("service.getAllBooks().size()=" + service.getAllBooks().size());
		return service.getAllBooks();
	}
	
	
//	@ModelAttribute
//	public void combineMethod(Model model) {
//		ShoppingCart sc = new ShoppingCart();
//		model.addAttribute("ShoppingCart", sc);
//		
//		System.out.println("在Ch04Controller1類別內的@ModelAttribute修飾的方法中,新建ShoppingCart物件=" + sc);
//		MemberBean mb = new MemberBean("kitty2020", "林曉珍");
//		model.addAttribute("memberBean", mb);
//		
//		model.addAttribute("allBooks", service.getAllBooks());
//		
//	}
	
	
}
 