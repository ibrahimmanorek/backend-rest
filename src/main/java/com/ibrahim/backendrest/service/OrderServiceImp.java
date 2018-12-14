package com.ibrahim.backendrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibrahim.backendrest.pojo.OrderPojo;
import com.ibrahim.backendrest.pojo.OrderList;
import com.ibrahim.backendrest.repository.CustomerRepository;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public OrderPojo getData(int id) {
		 
		 List<Object[]> objects = customerRepository.getProductList(id);
		List<OrderList> list = new ArrayList<OrderList>();
		for (Object[] obj2 : objects) {
			OrderList pl = new OrderList();
			pl.setProduct(obj2[0].toString());
			pl.setQuantity(obj2[1].toString());
			pl.setUnitPrice(obj2[2].toString());
			pl.setDiscount(obj2[3].toString());
			pl.setExtendedPrice(obj2[4].toString());
			list.add(pl);
		}
		
		List<Object[]> objects2 = customerRepository.getData(id);
		OrderPojo cp = new OrderPojo();
		 for (Object[] obj : objects2) {
			 cp.setCompanyName(obj[0].toString());
			 cp.setFirstName(obj[1].toString());
			 cp.setLastName(obj[2].toString());
			 cp.setShippingMethod(obj[3].toString());
			 cp.setOrderDate(obj[4].toString());
			 cp.setPoNumber(obj[5].toString());
			 cp.setShipDate(obj[6].toString());
			 cp.setFreightCharge(obj[7].toString());
			 cp.setTaxes(obj[8].toString());
			 cp.setOrderSubtotal(obj[9].toString());
			 cp.setList(list);
		}
		 
		 return cp;
	}

}

