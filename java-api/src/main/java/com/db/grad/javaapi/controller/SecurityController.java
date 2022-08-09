package com.db.grad.javaapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Dogs;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.SecurityRepository;

import com.db.grad.javaapi.repository.TradeRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class SecurityController {
	
	@Autowired
	 private SecurityRepository securityRepository;

     @Autowired
	 private TradeRepository tradeRepository;

    @GetMapping("/security")
    public List < Security > getAllSecurities() {
        return securityRepository.findAll();
    }
    

//    @GetMapping("/security/trade/{id}")
//    public ResponseEntity <Trade> getTradeById(@PathVariable(value = "id") Integer id)
//    throws ResourceNotFoundException {
//       Trade trade = tradeRepository.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id:: " + id));
//        return ResponseEntity.ok().body(trade);
//    }

    @GetMapping("/security/{id}")
    public ResponseEntity < Security > getSecurityById(@PathVariable(value = "id") Integer id)
    throws ResourceNotFoundException {
        Security security = securityRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));
        return ResponseEntity.ok().body(security);
    }
    
    @PostMapping("/security")
    public Security createSecurity(@Valid @RequestBody Security security) {
        return securityRepository.saveAndFlush(security);
    }
    
    
    @DeleteMapping("/security/{id}")
    public Map < String, Boolean > deleteSecurity(@PathVariable(value = "id") Integer id)
    throws Exception {
    	Security security = securityRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

    	securityRepository.delete(security);
        Map < String, Boolean > response = new HashMap <>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    @PutMapping("/security/{id}")
    public ResponseEntity < Security > updateSecurity(@PathVariable(value = "id") Integer id,
        @Valid @RequestBody Security securityDetails) throws ResourceNotFoundException {
    	Security getSecurity = securityRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

    	getSecurity.setIsin(securityDetails.getIsin());
    	getSecurity.setCusip(securityDetails.getCusip());
    	getSecurity.setIssuer(securityDetails.getIssuer());
    	getSecurity.setIsin(securityDetails.getIsin());
    	getSecurity.setMaturitydate(securityDetails.getMaturitydate());
    	getSecurity.setCoupon(securityDetails.getCoupon());
    	getSecurity.setType(securityDetails.getType());
    	getSecurity.setFacevalue(securityDetails.getFacevalue());
    	getSecurity.setStatus(securityDetails.getStatus());
        final Security updatedSecurity = securityRepository.save(getSecurity);
        return ResponseEntity.ok(updatedSecurity);
    }
    
    @GetMapping("/securitytrade/{id}")
    public ResponseEntity<List<Trade>> getAllTradesBySecurity(@PathVariable(value = "id") Integer id)
    	throws ResourceNotFoundException {
    	List<Trade> allTrades = new ArrayList<Trade>();
    	List<Trade> res= new ArrayList<Trade>();
	    Security security = securityRepository.findById(id)
		            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id:: " + id));
	    allTrades = tradeRepository.findAll();
	    	
	    for(Trade t: allTrades) {
	    	if(t.getSecurityid()==id) {
	    		res.add(t);
	    	}
	    }
	    return ResponseEntity.ok().body(res);
    	}
    
    @PutMapping("/securitystatus/{id}")
    public ResponseEntity < Security > updateSecurityStatus(@PathVariable(value = "id") Integer id) 
    		throws ResourceNotFoundException {
    	Security getSecurity = securityRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

    	getSecurity.setStatus(true);
        final Security updatedSecurity = securityRepository.save(getSecurity);
        return ResponseEntity.ok(updatedSecurity);
    }
    
    
}
