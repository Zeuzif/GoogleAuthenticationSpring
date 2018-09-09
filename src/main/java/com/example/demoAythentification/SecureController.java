package com.example.demoAythentification;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {
	@RequestMapping(value = "/user")
	public Principal auth(Principal principal)
	{
		return principal;
	}
}
