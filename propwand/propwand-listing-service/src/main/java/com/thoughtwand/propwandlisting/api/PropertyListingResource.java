package com.thoughtwand.propwandlisting.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtwand.propwandlisting.domain.Property;
import com.thoughtwand.propwandlisting.service.PropertyListingService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/api/properties")
public class PropertyListingResource {
	
	@Autowired
	private PropertyListingService service;
	
	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Find a Property by a given ID",
					notes = "Provide an ID to look up for a Property",
					response = Property.class)
	public Property getPropertyById(
			@ApiParam (value = "ID of the Property", required = true)
				@PathVariable Long id) {
		return new Property()
				.title("Helllo")
				.address("Colombo")
				.value(1000.00).withId(id);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation (value = "Find all Properties in the system",response = List.class)
	public List<Property> getAllProperties(){
		return Arrays.asList(new Property().title("Abc"));
	}
	
	@PostMapping
	@ApiOperation (value = "Create a new Property in the system", response = Property.class)
	public Property createProperty(@RequestBody Property property) {
		return service.createProperty(property);
	}
	
	/*
	 * @PutMapping public Property update(@RequestBody Property
	 * property, @PathVariable Long id) {
	 * 
	 * }
	 */
}
