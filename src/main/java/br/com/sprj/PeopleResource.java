package br.com.sprj;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PeopleResource extends PanacheEntityResource<Person, Long> {
	
}