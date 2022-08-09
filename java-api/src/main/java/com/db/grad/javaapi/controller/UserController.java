package com.db.grad.javaapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.*;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.*;

//package com.spring.restclient;

import java.util.HashMap;
import java.util.Map;
 
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/user")
    public List <Userd > getAllUserd() {
        return userRepository.findAll();
    }

    
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login(@RequestParam Map<String, String> customQuery) throws ResourceNotFoundException
    	{
	    	String result;
	    	
	    	String em=customQuery.get("email");
	    	String pass=customQuery.get("pass");
//	    	return em+" "+pass;
	    	try {
		    	Userd user = userRepository.findById(em)
	    	            .orElseThrow(() -> new ResourceNotFoundException("User not found for this Email:: " + em));
		    		if(user.getPassword().equals(pass)) {
			    		return "Success";
			    	}else {
			    		return "Incorrect Email or Password";
		    	}	 
	    	}catch(Exception e) {
	    		 return "Incorrect Email or Password";
	    	}
	    
    }

    @PostMapping("/user")
    public String createUserd(@Valid @RequestBody Userd user) {
    	if(userRepository.existsById(user.getEmail())) {
    		return "Already Exists";
    	}else
    		return "Successfully Created";
    }
    
    
}