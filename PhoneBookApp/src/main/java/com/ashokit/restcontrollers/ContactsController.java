package com.ashokit.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.ContactsForm;
import com.ashokit.service.ContactsService;

@RestController
public class ContactsController {
	@Autowired
	private ContactsService service;
	@PostMapping("/save")
	public String saveContact(@RequestBody ContactsForm form)
	{
		String status=service.saveContact(form) ;
		return status;
	}
	@GetMapping("/contacts")
	public List<ContactsForm> viewAllContacts()
	{
		return service.viewAllContacts();
	}
	@GetMapping("/edit/{contactId}")
	public ContactsForm editContact(@PathVariable Integer contactId)
	{
		return service.editContact(contactId);
	}
	@DeleteMapping("/delete/{contactId}")
	public List<ContactsForm> deleteContact(@PathVariable Integer contactId)
	{
		return service.deleteContact(contactId);
		
	}

}
