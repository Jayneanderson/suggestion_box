package br.com.style3.developersuggestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.style3.developersuggestion.domain.Suggestion;
import br.com.style3.developersuggestion.repository.ContactRepository;
import br.com.style3.developersuggestion.repository.SuggestionRepository;

@Service
public class SuggestionService {
	
	@Autowired
	SuggestionRepository suggestionRepository;
	
	@Autowired
	ContactRepository contactRepository;
	
	public void createSuggestion(Suggestion suggestion, Long id) {
		suggestion.setContact(contactRepository.findById(id).get());
		suggestionRepository.save(suggestion);
	}
	
	public List<Suggestion> readSuggestions() {
		return suggestionRepository.findAll();
	}
	
	public Optional<Suggestion> readSuggestionById(Long id) {
		return suggestionRepository.findById(id);
	}
	
	public Optional<Suggestion> update(Suggestion suggestion, Long id) {
		suggestion.setContact(contactRepository.findById(id).get());
		return suggestionRepository.findById(id); 
	}
	
	public void delete(Long idSuggestion) {
		suggestionRepository.deleteById(idSuggestion);
	}
}
