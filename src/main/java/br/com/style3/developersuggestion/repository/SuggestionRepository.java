package br.com.style3.developersuggestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.style3.developersuggestion.domain.Suggestion;
@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {

}
