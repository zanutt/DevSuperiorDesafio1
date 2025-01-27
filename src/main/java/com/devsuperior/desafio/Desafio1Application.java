package com.devsuperior.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
		

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Put the data here
		Order order = new Order(1034, 95.9, 0.0);		
		System.out.println("Pedido código " + order.getCode() +"\nValor total: R$ " + orderService.total(order));
	}

}
