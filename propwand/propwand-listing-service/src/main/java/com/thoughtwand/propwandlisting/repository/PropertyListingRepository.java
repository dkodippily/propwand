package com.thoughtwand.propwandlisting.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtwand.propwandlisting.domain.Property;


public interface PropertyListingRepository extends JpaRepository<Property, Long> {

}
