import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class couponTrackingLoginPage extends HttpsServelet {
	@RequestMapping("/welcome")
	public ModelAndView precouponTrackingLoginPage(){
		ModelAndView modelAndView = new ModelAndView("couponTrackingLoginPage"); 
		
		return modelAndView; 
				
	}
	
	@RequestMapping("/loginUser")
	public ModelAndView postcouponTrackingLoginPage(){
		System.out.println("dsd");
		ModelAndView modelAndView = new ModelAndView("couponTrackingHomePage"); 
		
		return modelAndView; 
				
	}

}
