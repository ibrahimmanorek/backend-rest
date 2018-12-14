package com.ibrahim.backendrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ibrahim.backendrest.model.Order;

@Repository
public interface CustomerRepository extends JpaRepository<Order, Integer> {
	
	@Query(value = "select c.company_name, e.first_name, e.last_name, \n" +
			"sm.shipping_methode, DATE_FORMAT(o.order_date, \"%d/%m/%Y\") , o.purchase_order_number, \n" + 
			"DATE_FORMAT(o.ship_date, \\\"%d/%m/%Y\\\"), o.freight_charge, o.taxes, sum(od.quantity * od.unit_price) \n" + 
			"from orders o\n" + 
			"join customers c\n" + 
			"on o.customer_id = c.customer_id\n" + 
			"join employees e\n" + 
			"on e.employee_id = o.employee_id\n" + 
			"join shipping_methods sm\n" + 
			"on sm.shipping_method_id = o.shipping_method_id\n" + 
			"join order_details od\n" + 
			"on od.order_id = o.order_id\n" + 
			"where o.order_id = :id", nativeQuery = true)
	List<Object[]> getData(@Param("id") int id);
	
	@Query(value = "select p.product_name, od.quantity, od.unit_price, od.discount, od.quantity * od.unit_price\n" + 
			"from orders o\n" + 
			"join customers c\n" + 
			"on o.customer_id = c.customer_id\n" + 
			"join employees e\n" + 
			"on e.employee_id = o.employee_id\n" + 
			"join shipping_methods sm\n" + 
			"on sm.shipping_method_id = o.shipping_method_id\n" + 
			"join order_details od\n" + 
			"on od.order_id = o.order_id\n" + 
			"join products p\n" + 
			"on p.product_id = od.product_id\n" + 
			"where o.order_id = :id", nativeQuery = true)
	List<Object[]> getProductList(@Param("id") int id);

}
