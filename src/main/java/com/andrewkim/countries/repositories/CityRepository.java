package com.andrewkim.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrewkim.countries.models.City;

@Repository
public interface CityRepository extends CrudRepository <City, Long>{
	List <City> findAll();
	
	@Query("select ci.name, ci.population from City ci " +
	"join ci.country c where c.name = 'Mexico' and ci.population > '500000'")
	List <Object []> findByName();
}
