package com.spring.entities.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.model.Entities;
import com.spring.entities.model.Entity;
import com.spring.entities.service.EntityService;


@RestController
@RequestMapping("/entities")
public class EntityServiceRest {
	
    @Autowired
    EntityService entityService;
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Entities getEntityDetails(@PathVariable("id") int id){
    	Entities entity = entityService.getEntityDetails(id);
    	System.out.println("getEntityDetails method : "+ entity.toString());
        return entity;
    }    

    @RequestMapping(method=RequestMethod.GET)
    public List<Entities> getAllEntityDetails(){
    	List<Entities> entities = entityService.getAllEntityDetails();
    	System.out.println("getAllEntityDetails method : "+ entities);
        return entities;
    }

    @RequestMapping(value="/results/{id}", method=RequestMethod.GET)
    public Entities getEntityDetailsWithAddress(@PathVariable("id") int id){
    	Entities entities = entityService.getEntityDetailsWithAddress(id);
    	System.out.println("getEntityDetailsWithMarks method : "+entities);
        return entities;
    }
}