package com.ashokit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entities.Contacts;
@Repository
public interface ContactsRepo extends JpaRepository<Contacts, Integer> {

}
