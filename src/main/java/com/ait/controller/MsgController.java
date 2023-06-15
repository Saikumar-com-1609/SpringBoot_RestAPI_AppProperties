package com.ait.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.appconstants.AppConstants;
import com.ait.properties.AppProperties;

@RestController
public class MsgController {

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/welcome")
	public String welcomeMsg() {

		Map<String, String> messages = appProperties.getMessages();

		return messages.get(AppConstants.WELCOME_MSG);
	}

	@GetMapping("/greet")
	public String greetMsg() {

		Map<String, String> messages = appProperties.getMessages();

		return messages.get(AppConstants.GREET_MSG);
	}

}
