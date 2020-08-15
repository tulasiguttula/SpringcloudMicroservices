package com.home.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.limitsservice.bean.LimitCongiguration;

@RestController
public class LimitServiceConfigurationController {

	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitCongiguration getLimitConfiguration() {
		
		return new LimitCongiguration(configuration.getMinimum(),configuration.getMaximum());
		
	}
}
