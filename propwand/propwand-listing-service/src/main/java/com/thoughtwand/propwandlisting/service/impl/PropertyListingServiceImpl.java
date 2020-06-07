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
	public void createProperty(Property property) {
		repository.save(property);
	}

}
