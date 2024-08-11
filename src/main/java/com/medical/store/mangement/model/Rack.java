package com.medical.store.mangement.model;

import lombok.Data;

@Data
public class Rack {

	private int id;
	private short capacity;
	private Medicine[] medicines;

}