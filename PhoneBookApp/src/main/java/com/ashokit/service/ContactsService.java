package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.bindings.ContactsForm;

@Service
public interface ContactsService {
	public String saveContact(ContactsForm form);
	public List<ContactsForm> viewAllContacts();
	public ContactsForm editContact(Integer contactId);
	public List<ContactsForm> deleteContact(Integer contactId);

}
