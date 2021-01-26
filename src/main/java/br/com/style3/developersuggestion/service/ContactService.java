package br.com.style3.developersuggestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.style3.developersuggestion.domain.Contact;
import br.com.style3.developersuggestion.repository.ContactRepository;
@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	public void createContact(Contact contact) {
		contactRepository.save(contact);
	}
	
	public List<Contact> readContacts() {
		return contactRepository.findAll();
	}
	
	public Optional<Contact> readContactById(Long id) {
		return contactRepository.findById(id);
	}
	
	public Optional<Contact> update(Contact contact, Long id) {
		return contactRepository.findById(id); 
	}
	
	public void delete(Long idContact) {
		contactRepository.deleteById(idContact);
	}
}
