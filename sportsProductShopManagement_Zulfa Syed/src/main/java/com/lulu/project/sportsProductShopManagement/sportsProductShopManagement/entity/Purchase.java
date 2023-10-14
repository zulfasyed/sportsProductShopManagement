package com.lulu.project.sportsProductShopManagement.sportsProductShopManagement.entity;


import java.time.LocalDate;

 

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name = "purchase")

 

 

public class Purchase {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;

	String productName;

	double cost;

	LocalDate dateOfPurchase;

	LocalDate deliveryDate;

	String customerFeedback;

	public Purchase() {

	super();

	// TODO Auto-generated constructor stub

	}

	public Purchase(Long id, String productName, double cost, LocalDate dateOfPurchase, LocalDate deliveryDate,

	String customerFeedback) {

	super();

	this.id = id;

	this.productName = productName;

	this.cost = cost;

	this.dateOfPurchase = dateOfPurchase;

	this.deliveryDate = deliveryDate;

	this.customerFeedback = customerFeedback;

	}

	public Long getId() {

	return id;

	}

	public void setId(Long id) {

	this.id = id;

	}

	public String getProductName() {

	return productName;

	}

	public void setProductName(String productName) {

	this.productName = productName;

	}

	public double getCost() {

	return cost;

	}

	public void setCost(double cost) {

	this.cost = cost;

	}

	public LocalDate getDateOfPurchase() {

	return dateOfPurchase;

	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {

	this.dateOfPurchase = dateOfPurchase;

	}

	public LocalDate getDeliveryDate() {

	return deliveryDate;

	}

	public void setDeliveryDate(LocalDate deliveryDate) {

	this.deliveryDate = deliveryDate;

	}

	public String getCustomerFeedback() {

	return customerFeedback;

	}

	public void setCustomerFeedback(String customerFeedback) {

	this.customerFeedback = customerFeedback;

	}

	@Override

	public String toString() {

	return "Purchase [id=" + id + ", productName=" + productName + ", cost=" + cost + ", dateOfPurchase="

	+ dateOfPurchase + ", deliveryDate=" + deliveryDate + ", customerFeedback=" + customerFeedback + "]";

	}

	}