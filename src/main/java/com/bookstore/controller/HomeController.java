package com.bookstore.controller;


/*import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;
import com.bookstore.service.impl.UserSecurityService;
import com.bookstore.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.cglib.core.Local;
/*import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	// will add below line of code later
	/*@Autowired
	private UserService userService;

	@Autowired
	private UserSecurityService userSecurityService;*/

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/myAccount")
	public String myAccount() {
		return "myAccount";
	}

	@RequestMapping(value = "/login")
	public String login(Model model){
		model.addAttribute("classActiveLogin",true);
		return "myAccount";
	}

	/*@RequestMapping(value = "/forgetPassword")
	public String forgetPassword(Model model){
		model.addAttribute("classActiveForgetPassword",true);
		return "myAccount";
	}*/

	@RequestMapping(value = "/newUser")
	public String newUser(Local locale,
			@RequestParam("token")String token,
			Model model){
		// will add below line of code later
		//PasswordResetToken passwordResetToken = userService.getPasswordResetToken(token);

		/*if(passwordResetToken == null){
			String message = "Invalid Token.";
			model.addAttribute("message", message);
			return "redirect:/badReqeust";
		}

		User user = passwordResetToken.getUser();
		String userName = user.getUsername();*/

		// will add below line of code later
		//UserDetails userDetails = userSecurityService.loadUserByUsername(userName);

		//Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());

		//SecurityContextHolder.getContext().setAuthentication(authentication);



		model.addAttribute("classActiveNewUser",true);
		return "myAccount";
	}
}