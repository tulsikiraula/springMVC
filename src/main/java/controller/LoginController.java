package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.LoginService;

@Controller
public class LoginController {
	
	@RequestMapping("/loginAction")
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		ModelAndView mv = new ModelAndView();

		System.out.println("I am here");

		LoginService service = new LoginService();

		if (service.checkLoginCredentials(username, password)) {
			mv.addObject("name", username);
			mv.setViewName("success");
		} else {
			mv.setViewName("index");
		}
		return mv;
	}

}
