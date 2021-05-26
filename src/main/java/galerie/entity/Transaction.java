package galerie.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Transaction {
	
	@Id @GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = false)
	private LocalDate date;
	
	@Column(nullable = true, unique = false)
	private float prixVente;
	
	@ManyToOne
	private Exposition lieuDeVente;
	
	@ManyToOne Personne client;
	
	@OneToOne Tableau oeuvre;
	
	public float getPrixVente() {
        return this.prixVente;
    }

    public LocalDate getVenduLe() {
        return this.date;
    }
	
	// Getters, Setters, Constructeur et ToString générés par Lombok
}
