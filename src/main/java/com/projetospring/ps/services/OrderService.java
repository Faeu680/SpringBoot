package com.projetospring.ps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.ps.entities.Order;
import com.projetospring.ps.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> op = repository.findById(id);
		return op.get();
	}
}