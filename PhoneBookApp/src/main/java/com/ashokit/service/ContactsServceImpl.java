package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.ContactsForm;
import com.ashokit.entities.Contacts;
import com.ashokit.repositories.ContactsRepo;
@Service
public class ContactsServceImpl implements ContactsService {
	@Autowired
	private ContactsRepo contactRepo;

	@Override
	public String saveContact(ContactsForm form) {
		Contacts entity = new Contacts();
		BeanUtils.copyProperties(form, entity);
		entity.setActivesw("y");
		entity=contactRepo.save(entity);
		if(entity.getContactId()!=null)
		{
			return "SUCCESS";
		}
		return "FAILURE";
	}

	@Override
	public List<ContactsForm> viewAllContacts() {
		List<ContactsForm> datalist=new ArrayList<>();
		List<Contacts> findAll = contactRepo.findAll();
		for (Contacts contacts : findAll) {
			ContactsForm form=new ContactsForm();
			BeanUtils.copyProperties(contacts,form);
			datalist.add(form);
		}
		return datalist;
	}

	@Override
	public ContactsForm editContact(Integer contactId) {
		Optional<Contacts> findById = contactRepo.findById(contactId);
		if(findById.isPresent())
		{
			Contacts contacts = findById.get();
			ContactsForm form=new ContactsForm();
			BeanUtils.copyProperties(contacts, form);
			return form;
		}
		return null;
	}

	@Override
	public List<ContactsForm> deleteContact(Integer contactId) {
		contactRepo.deleteById(contactId);
		return viewAllContacts();
	}

}
