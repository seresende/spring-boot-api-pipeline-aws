package com.resoft.mscompra.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resoft.mscompra.model.Purchase_Order;

@RestController
@RequestMapping("/request")
public class PurchaseOrderController {
	
	@PostMapping
	public ResponseEntity<Purchase_Order> save(@RequestBody Purchase_Order purchase_Order){
		return ResponseEntity.ok(purchase_Order);
	}

}
