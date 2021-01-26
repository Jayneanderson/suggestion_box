package br.com.style3.developersuggestion.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Suggestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsuggestion")
	private Long id;

	@NotBlank
	@Lob
	@Column(name = "text_suggestion")
	private String textSuggestion;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date creatDate = new Date();
	

}
