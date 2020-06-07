package com.thoughtwand.propwandlisting.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.thoughtwand.propwandlisting.domain.Property;

@DataJpaTest
public class PropertyListingRepositoryTest {
	@Autowired 
	private DataSource dataSource;
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private PropertyListingRepository propertyListingRepository;
	
	@Test
	public void testConfig() {
		assertThat(dataSource).isNotNull();
		assertThat(entityManager).isNotNull();
		assertThat(propertyListingRepository).isNotNull();
	}
	
	@Test
	public void testCreateAndFind() {
		Property p =  new Property()
				.title("Hello")
				.address("my address")
				.value(1000.00);
		propertyListingRepository.save(p);
		
		assertThat(propertyListingRepository.findAll().size() == 1).isTrue();
		;
	}
}
