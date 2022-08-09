package com.db.grad.javaapi.repository;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Userd;

public interface UserRepository extends JpaRepository<Userd, String>  {
//    Userd findByEmail(String username);

}
