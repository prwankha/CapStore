package com.cg.capstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.capstore.dto.*;

@Controller
public class CapStoreController {

	@RequestMapping(value = "Start", method = RequestMethod.GET)
	public String ShowLoginPage() {
		return "HomePage";
	}

	@RequestMapping(value = "ShowUserLoginPage", method = RequestMethod.GET)
	public String showCustomerLoginPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "CustomerLoginPage";
	}

	@RequestMapping(value = "ShowMerchantLoginPage", method = RequestMethod.GET)
	public String showMerchantLoginPage(Model model) {
		Merchant merchant = new Merchant();
		model.addAttribute("merchant", merchant);
		return "MerchantLoginPage";
	}

	@RequestMapping(value = "ValidateMerchant", method = RequestMethod.GET)
	public String validateMerchant(Model model, @ModelAttribute Merchant merchant) {
		merchant.getEmail();
		merchant.getPassword();
		return "CustomerLoginPage";
	}

	@RequestMapping(value = "ValidateUser", method = RequestMethod.GET)
	public String validateUser(Model model, @ModelAttribute User user) {
		model.addAttribute("str", "hii");
		return "MerchantLoginPage";
	}
}