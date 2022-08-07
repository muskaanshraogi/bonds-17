package com.db.grad.javaapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@RestController
@RequestMapping("/api/v1")
public class TradeController {
    @Autowired
    private TradeRepository tradeRepository;

//    @GetMapping("/dogs")
//    public List < Dogs > getAllDogs() {
//        return dogsRepository.findAll();
//    }

    @GetMapping("/trade/{id}")
    public ResponseEntity <Trade> getEmployeeById(@PathVariable(value = "id") Integer id)
    throws ResourceNotFoundException {
       Trade trade = tradeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id:: " + id));
        return ResponseEntity.ok().body(trade);
    }
    
//    @GetMapping("/trade/security/{id}")
//    public ResponseEntity <Trade> getEmployeeById(@PathVariable(value = "id") Long id)
//    throws ResourceNotFoundException {
//       Trade trade = tradeRepository.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id:: " + id));
//        return ResponseEntity.ok().body(trade);
//    }

//    @PostMapping("/dogs")
//    public Dogs createDog(@Valid @RequestBody Dogs dogs) {
//        return dogsRepository.saveAndFlush(dogs);
//    }
//
//    @PutMapping("/dogs/{id}")
//    public ResponseEntity < Dogs > updateDog(@PathVariable(value = "id") Long id,
//        @Valid @RequestBody Dogs dogDetails) throws ResourceNotFoundException {
//    	Dogs getDog = dogsRepository.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Dog not found for this id :: " + id));
//
//    	getDog.setName(dogDetails.getName());
//    	getDog.setAge(dogDetails.getAge());
//        final Dogs updatedDogs = dogsRepository.save(getDog);
//        return ResponseEntity.ok(updatedDogs);
//    }
//
//    @DeleteMapping("/dogs/{id}")
//    public Map < String, Boolean > deleteDog(@PathVariable(value = "id") Long id)
//    throws Exception {
//    	Dogs dogs = dogsRepository.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Dog not found for this id :: " + id));
//
//    	dogsRepository.delete(dogs);
//        Map < String, Boolean > response = new HashMap <>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}
