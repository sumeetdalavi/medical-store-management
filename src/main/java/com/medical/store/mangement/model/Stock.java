package com.medical.store.mangement.model;

import java.util.Date;

import lombok.Data;

@Data
public class Stock {

	private long id;
	private String medicine;
	private Date added;
	private Rack location;

}