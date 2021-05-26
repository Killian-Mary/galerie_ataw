package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
public class Exposition {
	
	@Id @GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = false)
	private LocalDate debut;
	
	@Column(nullable = false, unique = false)
	private String intitule;
	
	@Column(nullable = false, unique = false)
	private Integer duree;
	
	@ManyToOne
	private Galerie organisateur;
	
	@OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>();
	
	@ManyToMany (mappedBy = "accrochage")
    List<Tableau> oeuvres = new LinkedList<>();
	
	// Getters, Setters, Constructeur et ToString générés par Lombok
	
	public float ChiffreDAffaires(){
        float chiffreDAffaires = 0f;
        for(Transaction tableau: ventes){
        	chiffreDAffaires +=tableau.getPrixVente();
        }
        return chiffreDAffaires;
    }
}
