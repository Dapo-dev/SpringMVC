package ch04.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("ShoppingCart")
@RequestMapping("/ch04")
public class Ch04ShoppringCartController {
	@RequestMapping("showCartContent")
	public String showCartContent(Model model) {
		Map<String, Object> map = model.asMap();
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		return "ch04/showCartContent";
	}
}
