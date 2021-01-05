package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entitites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	// retornar em ordem alfabetica
	List<Product> findAllByOrderByNameAsc();
}