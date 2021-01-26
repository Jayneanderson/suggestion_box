package br.com.style3.developersuggestion.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idphone")
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 11)
	@Column(name = "number")
	private String number;
	
	//muitos telefones para um contato
	@ManyToOne
	@JoinColumn(name = "idcontact")
	private Contact contact;
	
	public Phone() {
		super();
	}

}
