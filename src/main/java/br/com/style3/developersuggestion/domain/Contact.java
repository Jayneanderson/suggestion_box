package br.com.style3.developersuggestion.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontact")
	private Long id;
	
	@NotBlank
	@Range(min = 3, max = 40, message = "O nome deve ter no mínimo duas letras")
	private String name;
	
	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
	private List<Phone> phones;
	
	@OneToOne(mappedBy = "contact", cascade = CascadeType.ALL) 
	private Suggestion suggestion;
	
}
