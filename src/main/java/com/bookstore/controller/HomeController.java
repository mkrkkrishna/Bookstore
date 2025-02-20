package com.bookstore.controller;


/*import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;
import com.bookstore.service.impl.UserSecurityService;
import com.bookstore.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;*/
import com.bookstore.domain.User;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.UserRole;
import com.bookstore.utility.SecurityUtility;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cglib.core.Local;
/*import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Controller
public class HomeController {

	// will add below line of code later
    /*

    @Autowired
	private JavaMailSender mailSender;

	@Autowired
	private MailConstructor mailConstructor;

    @Autowired
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

    @RequestMapping(value = "/forgetPassword")
	public String forgetPassword(
			HttpServletRequest httpServletRequest,
			@ModelAttribute("email") String email,
			Model model
	){
		model.addAttribute("classActiveForgetPassword",true);

		/*User user = userService.findByEmail(email);

		if(user == null){
			model.addAttribute("emailNotExist", true);
			return "myAccount";
		}

		String password = SecurityUtility.randomPassword();

		String encriptedPassword = SecurityUtility.passwordEncoder().encode(password);

		user.setPassword(encriptedPassword);

		userService.save(user);

		String token = UUID.randomUUID().toString();

		userService.createPasswordResetTokenForUser(user, token);

		String appUrl = "http://"+ httpServletRequest.getServerName()+":"+ httpServletRequest.getServerPort()+ httpServletRequest.getContextPath();

		SimpleMailMessage newEmail = mailConstructor.constructRestTokenEmail(appUrl, httpServletRequest.getLocale(), token, user, password);

		mailSender.send(newEmail);*/

		model.addAttribute("forgetPasswordEmailSent","true");


		return "myAccount";
	}


	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public String newUserPost(
			HttpServletRequest httpServletRequest,
			@ModelAttribute("email") String userEmail,
			@ModelAttribute("userName") String userName,
			Model model) throws Exception{
		model.addAttribute("classActiveNewAccount", true);
		model.addAttribute("email", userEmail);
		model.addAttribute("userName", userName);

		/*if(userService.findByUserName(userName) != null){
			model.addAttribute("userNameExists", true);
			return "myAccount";
		}

		if(userService.findByUEmail(userEmail) != null){
			model.addAttribute("emailExists", true);
			return "myAccount";
		}*/

		/*User user = new User();
		user.setUsername(userName);
		user.setEmail(userEmail);

		String password = SecurityUtility.randomPassword();

		String encriptedPassword = SecurityUtility.passwordEncoder().encode(password);
		user.setPassword(encriptedPassword);

		Role role = new Role();
		role.setRoleId(1);
		role.setName("ROLE_USER");
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, role));
		userService.createUser(user,userRoles);

		String token = UUID.randomUUID().toString();

		userService.createPasswordResetTokenForUser(user, token);

		String appUrl = "http://"+ httpServletRequest.getServerName()+":"+ httpServletRequest.getServerPort()+ httpServletRequest.getContextPath();

		SimpleMailMessage email = mailConstructor.constructRestTokenEmail(appUrl, httpServletRequest.getLocale(), token, user, password);

		mailSender.send(email);*/

		model.addAttribute("emailSent","true");

		return "myAccount";
	}

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

		//model.addAttribute("user",user);


		model.addAttribute("classActiveNewUser",true);
		return "myProfile";
	}
}