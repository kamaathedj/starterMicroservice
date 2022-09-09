package com.kamaathedj.OrderService;

import com.kamaathedj.SharedLogic.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public Order addOrder(){
		Order order = new Order(1,"nanan",3);
		return order;
	}

}
