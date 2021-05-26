package galerie.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Personne {
	
	@Id @GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = false)
	private String nom;
	
	@Column(nullable = true, unique = false)
	private String adresse;
	
	@OneToMany(mappedBy = "client")
    private List<Transaction> achats = new LinkedList<>();
	
	// Getters, Setters, Constructeur et ToString générés par Lombok
}
 