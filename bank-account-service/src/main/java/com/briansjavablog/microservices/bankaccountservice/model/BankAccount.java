package com.briansjavablog.microservices.bankaccountservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class BankAccount {

	
	private String accountId;
	private String accountName;
	private EnumAccountType accountType;
	private BigDecimal accountBlance;
	
}
