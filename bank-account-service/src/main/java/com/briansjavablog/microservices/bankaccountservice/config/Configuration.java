package com.briansjavablog.microservices.bankaccountservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix="bank-account-service")
@Data
public class Configuration {
	
	
	private Double minBalance;
	
	
	private Double maxBalance;

	public Double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Double minBalance) {
		this.minBalance = minBalance;
	}

	public Double getMaxBalance() {
		return maxBalance;
	}

	public void setMaxBalance(Double maxBalance) {
		this.maxBalance = maxBalance;
	}
	
	

}
