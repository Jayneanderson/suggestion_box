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

public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontact")
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 40, message = "O nome deve ter no mínimo duas letras")
	private String name;
	
	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
	private List<Phone> phones;
	
	@OneToOne(mappedBy = "contact", cascade = CascadeType.ALL) 
	private Suggestion suggestion;
	
	public Contact() {
		super();
	}
}
