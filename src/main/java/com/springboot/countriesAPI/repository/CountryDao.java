package com.springboot.countriesAPI.repository;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.countriesAPI.domain.Country;

@Component
public interface CountryDao {

	public Map<String, Country> getAllCountries();
	
	public Map<String, Country> getCountryByName(String name);
}
