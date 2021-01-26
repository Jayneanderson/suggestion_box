package br.com.style3.developersuggestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.style3.developersuggestion.domain.Phone;
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
	
	public List<Phone> getByContact(Long contactId);
}
