package com.suresh.spring.limitsservice.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {
	
	private int maxLimits;
	
	private int minLimits;
	
	public LimitsConfiguration() {
		
	}

	public LimitsConfiguration(int maxLimits, int minLimits) {
		super();
		this.maxLimits = maxLimits;
		this.minLimits = minLimits;
	}

	public int getMaxLimits() {
		return maxLimits;
	}

	public void setMaxLimits(int maxLimits) {
		this.maxLimits = maxLimits;
	}

	public int getMinLimits() {
		return minLimits;
	}

	public void setMinLimits(int minLimits) {
		this.minLimits = minLimits;
	}
	
	

}
