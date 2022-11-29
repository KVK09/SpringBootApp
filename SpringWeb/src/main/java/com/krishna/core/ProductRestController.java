package com.krishna.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/Product/",method = RequestMethod.GET)
	public List<Products> getProducts(){
		return repository.findAll();
	}
	
	@RequestMapping(value = "/Product/{id}",method = RequestMethod.GET)
	public Products getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/Product/",method = RequestMethod.POST)
	public Products createProducts(Products products) {
		return repository.save(products);
	}
	
	@RequestMapping(value = "/Product/",method = RequestMethod.PUT)
	public Products updateProducts(Products products) {
		return repository.save(products);
	}
	
	@RequestMapping(value = "/Product/{id}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	
	

}
