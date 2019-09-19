package com.springboot.countriesAPI.domain;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Country {
	
	private String name;
	private String capital;
	private String largestCity;
	private Long area;
	private Long population;
	private LocalDate dateAdded;
	
	public Country() {
	}
	
	
	public Country(String name, String capital, String largestCity, Long area, Long population, LocalDate dateAdded) {
		super();
		this.name = name;
		this.capital = capital;
		this.largestCity = largestCity;
		this.area = area;
		this.population = population;
		this.dateAdded = dateAdded;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLargestCity() {
		return largestCity;
	}

	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate date) {
		this.dateAdded = date;
	}
}
