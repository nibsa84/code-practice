package com.springboot.countriesAPI.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.springboot.countriesAPI.domain.Country;

@Repository
public class CountryDaoImpl implements CountryDao {

	private static final Map<String, Country> countries = new HashMap<String, Country>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setLargestCity("Madrid");
		spain.setArea(194897L);
		spain.setPopulation(47000000L);
		// spain.setDateAdded(09/04/2019);
		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setLargestCity("Warsaw");
		poland.setArea(120726L);
		poland.setPopulation(38430000L);
		// poland.setDateAdded(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setLargestCity("London");
		uk.setArea(93628L);
		uk.setPopulation(66040000L);
		// uk.setDateAdded(38186860);

		countries.put(uk.getName(), uk);
	}

	public Map<String, Country> getAllCountries() {
		return countries;
	}

	@Override
	public Map<String, Country> getCountryByName(String name){
		return 	countries
				.entrySet()
                .stream()
                .filter(x -> x.getKey().equalsIgnoreCase(name))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	}
}
