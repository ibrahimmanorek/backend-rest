package com.ibrahim.backendrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ibrahim.backendrest.pojo.OrderPojo;
import com.ibrahim.backendrest.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService customerService;
	
	@GetMapping("customers/{id}")
	public OrderPojo getData(@PathVariable("id") int id){
		return customerService.getData(id);
	}
	
//	@GetMapping("customers")
//	public List<CustomerPojo> getList(){
//		return customerService.getData();
//	}
}
