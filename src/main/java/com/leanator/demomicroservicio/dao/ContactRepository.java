package com.leanator.demomicroservicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leanator.demomicroservicio.dto.Contact;
 
public interface ContactRepository extends JpaRepository<Contact, Long> {
 
}