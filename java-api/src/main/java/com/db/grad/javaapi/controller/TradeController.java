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
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.SecurityRepository;

@RestController
@RequestMapping("/api/v1")
public class TradeController {
    @Autowired
    private TradeRepository tradeRepository;
    @Autowired
    private SecurityRepository securityRepository;

    @GetMapping("/trade")
    public List < Trade > getAllTrade() {
        return tradeRepository.findAll();
    }

    @GetMapping("/trade/{id}")
    public ResponseEntity <Trade> getEmployeeById(@PathVariable(value = "id") Integer id)
    	    throws ResourceNotFoundException {
    	       Trade trade = tradeRepository.findById(id)
    	            .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id:: " + id));
    	        return ResponseEntity.ok().body(trade);
    	    }
   
    @GetMapping("/trades/{id}")
    public ResponseEntity<Security> getTradeById(@PathVariable(value = "id") Integer id)
    	    throws ResourceNotFoundException {
	    	Trade trade = tradeRepository.findById(id)
		            .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id:: " + id));
		        int sid= trade.getSecurityid();
		        Security security = securityRepository.findById(sid)
	              .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));
	          return ResponseEntity.ok().body(security);
    	}
    

    @PostMapping("/trade")
    public Trade createTrade(@Valid @RequestBody Trade trade) {
        return tradeRepository.saveAndFlush(trade);
    }
    
    
}