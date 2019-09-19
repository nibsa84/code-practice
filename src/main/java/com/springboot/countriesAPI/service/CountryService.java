package com.springboot.countriesAPI.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import com.springboot.countriesAPI.domain.Country;

@Service
public interface CountryService {
	
	public Map<String, Country> getAllCountries();
	
	public Map<String, Country> getCountryByName(String name);
	
	public void addCountry(String name, Country country);

}
