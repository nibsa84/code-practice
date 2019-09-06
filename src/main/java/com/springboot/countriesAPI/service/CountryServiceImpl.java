package com.springboot.countriesAPI.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.countriesAPI.domain.Country;
import com.springboot.countriesAPI.repository.CountryDao;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryDao countryDao;

	@Override
	public Map<String, Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	@Override
	public Map<String, Country> getCountryByName(String name) {
		return countryDao.getCountryByName(name);
	}

}
