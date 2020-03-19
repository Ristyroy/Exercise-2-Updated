package com.exercise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Table(name = "items")
public @Data class Item {
    @Column(name="item_id")
	private int itemId;
    @Column(name ="item_description")
	private String shortDescription;
    @Column(name ="item_price")
	private int price;
    @Column(name="item_brand")
	private String brand;
	
	

	



	



}
