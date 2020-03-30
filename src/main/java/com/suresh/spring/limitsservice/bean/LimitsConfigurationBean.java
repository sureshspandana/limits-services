package com.suresh.spring.limitsservice.bean;

public class LimitsConfigurationBean {
	
	private int maxLimits;
	
	private int minLimits;

	public LimitsConfigurationBean() {
		
	}
	public LimitsConfigurationBean(int maxLimits, int minLimits) {
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
