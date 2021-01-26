package br.com.style3.developersuggestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.style3.developersuggestion.domain.Phone;
import br.com.style3.developersuggestion.repository.ContactRepository;
import br.com.style3.developersuggestion.repository.PhoneRepository;
@Service
public class PhoneService {
	
	@Autowired
	PhoneRepository phoneRepository;
	
	@Autowired
	ContactRepository contactRepository;
	
	public void createPhone(Phone phone, Long id) {
		phone.setContact(contactRepository.findById(id).get());
		phoneRepository.save(phone);
	}
	
	public List<Phone> readPhones() {
		return phoneRepository.findAll();
	}
	
	public Optional<Phone> readById(Long id) {
		return phoneRepository.findById(id);
	}
	
	public Optional<Phone> update(Phone phone, Long id) {
		phone.setContact(contactRepository.findById(id).get());
		return phoneRepository.findById(id); 
	}
	
	public void delete(Long idPhone) {
		phoneRepository.deleteById(idPhone);
	}
}
