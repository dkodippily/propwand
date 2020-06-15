package com.thoughtwand.propwandlisting.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thoughtwand.propwandlisting.domain.Property;

@SpringBootTest
public class PropertyListingServiceTest {
	
	@Autowired
	private PropertyListingService service;
	
	@Test
	public void testCreateProperty() {
		createProperty();
	}

	private Property createProperty() {
		Property p = new Property()
				.title("Awesome house")
				.address("Cool location")
				.value(1000.00);
		assertNull(p.getId(),"ID should be null before save");
		service.createProperty(p);
		assertNotNull(p.getId(),"after savinf there should be a id");
		return p;
	}
	
	@Test
	public void testUpdateProperty() {
		String newTitle = "My New Title";
		Property p = createProperty();
		p.title(newTitle);
		Property updated = service.updateProperty(p, p.getId());
		assertEquals(newTitle, updated.getTitle(),"Title should be updated");
	}
}
