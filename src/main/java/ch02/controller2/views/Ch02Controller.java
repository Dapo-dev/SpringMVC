package ch02.controller2.views;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller (value="Ch02Controller2")
@RequestMapping("/ch02")
public class Ch02Controller {

	@GetMapping("/abc/kitty/snoopy") //找到哪一隻
	public String welcome(Model model, HttpServletRequest request, HttpSession session) {
		model.addAttribute("title", "歡迎光臨COVID19小站");
		model.addAttribute("subtitle", "快快封城");
		request.setAttribute("NG", "不好的做法...");
		return "welcome";
	}
}
 