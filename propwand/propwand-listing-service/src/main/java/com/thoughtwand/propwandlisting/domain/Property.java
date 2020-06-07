package com.thoughtwand.propwandlisting.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String address;
	private Double value;
	
	public Property withId(Long id) {
		this.setId(id);
		return this;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Property title(String title) {
		this.setTitle(title);
		return this;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Property address(String address) {
		this.setAddress(address);
		return this;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Property value(Double value) {
		this.setValue(value);
		return this;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
