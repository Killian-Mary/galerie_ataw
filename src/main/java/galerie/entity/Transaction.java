package galerie.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Transaction {

	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Exposition lieuDeVente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Personne client;
	
	@OneToOne
	private Tableau oeuvre;
	
	@Column(unique = false)
	@NonNull
	private LocalDate venduLe;
	
	@Column(unique = false)
	@NonNull
	private float prixVente;
}
