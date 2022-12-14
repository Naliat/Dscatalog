package com.labweb.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labweb.dscatalog.entities.Category;

@RequestMapping(value = "/categories")
@RestController 
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
	 List<Category> list = new ArrayList<>();
	 list.add(new Category(1L, "Books"));
	 list.add(new Category(2L, "Electonics"));
	 return ResponseEntity.ok().body(list); 
	 
	 
	 
	 
	}

	
}
  