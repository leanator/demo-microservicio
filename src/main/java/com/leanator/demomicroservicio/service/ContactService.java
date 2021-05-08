package com.leanator.demomicroservicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leanator.demomicroservicio.dao.ContactRepository;
import com.leanator.demomicroservicio.dto.Contact;

//(1)
@Service
public class ContactService {
 // (2)
 @Autowired
 ContactRepository dao;
  
 // (3)
 public Contact save(Contact contact){
     return dao.saveAndFlush(contact);
 }
}
