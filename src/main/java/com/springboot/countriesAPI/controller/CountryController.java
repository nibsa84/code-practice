package com.springboot.countriesAPI.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.countriesAPI.domain.Country;
import com.springboot.countriesAPI.service.CountryService;

@RestController
public class CountryController {
	@Autowired
	private CountryService countryService;

	@RequestMapping("/countries")
	public Map<String, Country> getCountries(){
		return countryService.getAllCountries();
	}
	
	@RequestMapping("/countries/{name}")
	public Map<String, Country> getCountryByName(@PathVariable String name){
		return countryService.getCountryByName(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/countries")
	public void addCountry(@RequestBody Country country){
		countryService.addCountry(country.getName(), country);
	}
}
