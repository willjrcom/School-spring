package com.gazaltech.core.domain.address;

import lombok.Data;

@Data
public class Address {
	private String street;
	private Integer number;
	private String neighborhood;
	private String city;
	private String zipCode;
	
	public static class AddressBuilder {
		private Address address;
		
		public AddressBuilder() {
			this.address = new Address();
		}
		
		public AddressBuilder withStreet(String street) {
			this.address.street = street;
			return this;
		}

		public AddressBuilder withNumber(Integer number) {
			this.address.number = number;
			return this;
		}

		public AddressBuilder withNeighborhood(String neighborhood) {
			this.address.neighborhood = neighborhood;
			return this;
		}

		public AddressBuilder withCity(String city) {
			this.address.city = city;
			return this;
		}

		public AddressBuilder withZipCode(String zipCode) {
			this.address.zipCode = zipCode;
			return this;
		}
		
		public Address build() {
			return this.address;
		}
	}
}
