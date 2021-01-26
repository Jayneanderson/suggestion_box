package br.com.style3.developersuggestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.style3.developersuggestion.domain.Contact;
@Repository
public interface PhoneRepository extends JpaRepository<Contact, Long> {

}
