package com.gazaltech.general.domain.address;

import lombok.Data;

@Data
public class Address {
	private String street;
	private int number;
	private String neighborhood;
	private String city;
	private String zipCode;
}
