package com.medical.store.mangement.model;

import java.util.Date;

import lombok.Data;

@Data
public class Medicine {

	private String name;
	private String Manufacturer;
	private Date expiry;
	private Date manufactured;
	private String[] contents;

}