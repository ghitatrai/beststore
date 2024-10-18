package com.bosstmytool.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosstmytool.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
