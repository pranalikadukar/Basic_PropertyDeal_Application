package com.example.PropertyMarket1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PropertyMarket1.model.Property;
import com.example.PropertyMarket1.repository.PropertyRepository;

@Service
public class PropertyService {
	 @Autowired
	    private PropertyRepository propertyRepository;

	    public Property addProperty(Property property) {
	        return propertyRepository.save(property);
	    }
	    
	    public List<Property> getPropertiesBySeller(Long sellerId) {
	        return propertyRepository.findBySellerId(sellerId);
	    }

	    public List<Property> getAllProperties() {
	        return propertyRepository.findAll();
	    }

	    public void deleteProperty(Long propertyId) {
	    	
	        propertyRepository.deleteById(propertyId);
	    }
}
