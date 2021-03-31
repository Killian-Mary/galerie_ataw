package galerie.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Tableau {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	@NonNull
	private String titre;
	
	@Column(unique = false)
	@NonNull
	private String support;
	
	@Column(unique = false)
	@NonNull
	private int largeur;
	
	@Column(unique = false)
	@NonNull
	private int hauteur;
	
	@OneToOne(mappedBy = "oeuvre")
    private Transaction vendu; 

	@ManyToMany(mappedBy = "oeuvres")
    List<Exposition> accrochages = new LinkedList<>();
	
	@ManyToOne
	private Artiste artiste;
	
}
