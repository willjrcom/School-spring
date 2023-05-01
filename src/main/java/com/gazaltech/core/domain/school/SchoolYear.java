package com.gazaltech.core.domain.school;

import java.util.Date;

import org.bson.types.ObjectId;

import lombok.Getter;

@Getter
public class SchoolYear {
	private ObjectId id;
	private Date date;
	
	public SchoolYear() {
		this.date = new Date();
	}
}
