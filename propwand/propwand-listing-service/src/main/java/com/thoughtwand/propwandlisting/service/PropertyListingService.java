package com.thoughtwand.propwandlisting.service;

import com.thoughtwand.propwandlisting.domain.Property;

public interface PropertyListingService {
	public Property createProperty(Property property); 
	
	public Property updateProperty(Property property, Long id);
}
