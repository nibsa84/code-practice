package com.springboot.countriesAPI.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Country {
	
	private String name;
	private String capital;
	private String largestCity;
	private Long area;
	private Long population;
	private Date dateAdded;
	
	public Country() {
	}
	
	
	public Country(String name, String capital, String largestCity, Long area, Long population, Date dateAdded) {
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

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
}
