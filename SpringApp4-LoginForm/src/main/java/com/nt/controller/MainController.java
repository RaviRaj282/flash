
package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.beans.User;

/**
 * @author raviraj
 *
 */
@Controller
public class MainController {
	@RequestMapping(value = "/user")
	public String displayForm(Model model) {

		model.addAttribute("user", new User());
		initialFormValues(model);
		return "user";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		model.addAttribute("msg", "Registration Successfull----");
		initialFormValues(model);
		return "result";

	}

	public String initialFormValues(Model model) {
		List<String> genderList = new ArrayList();
		genderList.add("Male");
		genderList.add("Female");
		model.addAttribute("genders", genderList);
		return "result";
	}

}
