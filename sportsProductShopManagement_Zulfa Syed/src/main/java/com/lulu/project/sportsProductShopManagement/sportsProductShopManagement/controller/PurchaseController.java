package com.lulu.project.sportsProductShopManagement.sportsProductShopManagement.controller;




import java.util.List;

 

 

 

import org.springframework.web.bind.annotation.RestController;

import com.lulu.project.sportsProductShopManagement.sportsProductShopManagement.entity.Purchase;
import com.lulu.project.sportsProductShopManagement.sportsProductShopManagement.repo.PurchaseRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

 

@RestController

 

public class PurchaseController {

	@Autowired

	PurchaseRepository purchaseRepository;

	@GetMapping("/getPurchase")

	public List<Purchase> getPurchase() {

	return purchaseRepository.findAll();

	}

	@PostMapping("/addPurchase")

	public Purchase createPurchase(@RequestBody Purchase purchase) {

	return purchaseRepository.save(purchase);

	}

	@DeleteMapping("/delPurchase/{id}")

	public void deletePurchase(@PathVariable int id) {

	purchaseRepository.deleteById(id);

	}

	}
