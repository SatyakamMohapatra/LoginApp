package com.LoginApp.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LoginApp.form.userForm;
import com.LoginApp.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView loginRedirect(){
		System.out.println("[LoginController][loginRedirect][]");
		return new ModelAndView("Login","userForm",new userForm());	
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("userFrom") userForm userForm){
		System.out.println("[login][loginSucessControler]");
		String userName = userForm.getUserName();
		String password = userForm.getPassword();
		System.out.println(userName+" "+ password);
		loginService.Save(userForm);
		return new ModelAndView("sucess");	
	}
	
	@RequestMapping(value="/forgot", method = RequestMethod.GET)
	public ModelAndView forgotRedirect(){
		System.out.println("[forgotRedirect][loginRedirect][]");
		return new ModelAndView("forgot");
	}
	
}
