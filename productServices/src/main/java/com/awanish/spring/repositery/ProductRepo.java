package com.awanish.spring.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.spring.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
