package com.andrewkim.countries.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrewkim.countries.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository <Language, Long> {
	List <Language> findAll();
}
