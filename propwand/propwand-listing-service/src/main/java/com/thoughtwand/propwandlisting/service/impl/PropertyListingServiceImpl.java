package com.thoughtwand.propwandlisting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtwand.propwandlisting.domain.Property;
import com.thoughtwand.propwandlisting.repository.PropertyListingRepository;
import com.thoughtwand.propwandlisting.service.PropertyListingService;


@Service
public class PropertyListingServiceImpl implements PropertyListingService {
	@Autowired
	private PropertyListingRepository repository;
	
	@Override
	public Property createProperty(Property property) {
		return repository.save(property);
	}

	@Override
	public Property updateProperty(Property property, Long id) {
		return repository.findById(id)
			.map ( p -> {
				p
				.title(property.getTitle())
				.address(property.getAddress())
				.value(property.getValue());
				return repository.save(p);
			}).get();
	}

}
