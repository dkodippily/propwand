package com.thoughtwand.propwandlisting.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtwand.propwandlisting.domain.Property;
import com.thoughtwand.propwandlisting.service.PropertyListingService;


@RestController
@RequestMapping("/api/properties")
public class PropertyListingResource {
	
	@Autowired
	private PropertyListingService service;
	
	@GetMapping("/{id}")
	public Property getProperty(@PathVariable Long id) {
		service.getClass();
		return new Property()
				.title("Helllo")
				.address("Colombo")
				.value(1000.00).withId(id);
	}
	
	@GetMapping
	public List<Property> getAllProperties(){
		return Arrays.asList(new Property().title("Abc"));
	}
}
