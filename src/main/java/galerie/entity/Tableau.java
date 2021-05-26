package galerie.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
public class Tableau {
	
	@Id @GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = false)
	private String titre;
	
	@Column(nullable = false, unique = false)
	private String support;
	
	@Column(nullable = false, unique = false)
	private Integer largeur;
	
	@Column(nullable = false, unique = false)
	private Integer hauteur;
	
	@OneToOne(mappedBy = "oeuvre")
	private Transaction vendu;
	
	@ManyToOne
    Artiste auteur;
	
	@ManyToMany
    List<Exposition> accrochage = new LinkedList<>();
}
