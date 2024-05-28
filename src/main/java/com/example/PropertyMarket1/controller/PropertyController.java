package com.example.PropertyMarket1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PropertyMarket1.model.Property;
import com.example.PropertyMarket1.services.PropertyService;

@Controller
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/properties")
    public String listProperties(Model model) {
        List<Property> properties = propertyService.getAllProperties();
        model.addAttribute("properties", properties);
        return "properties";
    }

    @GetMapping("/properties/add")
    public String showAddPropertyForm(Model model) {
        model.addAttribute("property", new Property());
        return "addProperty";
    }

    @GetMapping("/properties/seller/{sellerId}")
    public String listSellerProperties(@PathVariable Long sellerId, Model model) {
        List<Property> properties = propertyService.getPropertiesBySeller(sellerId);
        model.addAttribute("properties", properties);
        return "sellerProperties";
    }
//
//@RestController
//@RequestMapping("/api/properties")
//public static class PropertyRestController {
//	@Autowired
//    private PropertyService propertyService;
//
//	 @PostMapping("/add")
//     public Property addProperty(@RequestBody Property property) {
//         return propertyService.addProperty(property);
//     }
//
//	 @GetMapping("/{id}")
//     public Property getPropertyById(@PathVariable Long id) {
//         Optional<Property> property = propertyService.getPropertyById(id);
//         return property.orElse(null);
//     }
//
//     @GetMapping
//     public List<Property> getAllProperties() {
//         return propertyService.getAllProperties();
//     }
//
//     @GetMapping("/seller/{sellerId}")
//     public List<Property> getPropertiesBySeller(@PathVariable Long sellerId) {
//         return propertyService.getPropertiesBySeller(sellerId);
//     }
 //}

}

