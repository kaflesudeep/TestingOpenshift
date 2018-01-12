package com.ExpensesTrackingWebApp.Controllers;

	import javax.servlet.http.HttpServlet;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class expenseTrackingLoginPage extends HttpServlet {
		@RequestMapping("/welcome")
		public ModelAndView precouponTrackingLoginPage(){
			ModelAndView modelAndView = new ModelAndView("expenseTrackingLoginPage"); 
			System.out.println("1dsd");
			return modelAndView; 
					
		}
		
		@RequestMapping("/loginUser")
		public ModelAndView postexpenseTrackingLoginPage(){
			System.out.println("dsd");
			ModelAndView modelAndView = new ModelAndView("expenseTrackingHomePage"); 
			
			return modelAndView; 
					
		}
		
	}