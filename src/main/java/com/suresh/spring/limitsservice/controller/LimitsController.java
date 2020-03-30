package com.suresh.spring.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.spring.limitsservice.bean.LimitsConfiguration;
import com.suresh.spring.limitsservice.bean.LimitsConfigurationBean;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	
	@GetMapping("/limits")
	public LimitsConfigurationBean retrieveLimits() {
		return new LimitsConfigurationBean(limitsConfiguration.getMaxLimits(),limitsConfiguration.getMinLimits());
	}

}
