package com.example.PropertyMarket1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PropertyMarket1.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long>{
	List<Property> findBySellerId(Long sellerId);

}
