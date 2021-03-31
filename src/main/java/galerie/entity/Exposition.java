package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = false)
	@NonNull
	private LocalDate debut;
	
	@Column(unique = false)
	@NonNull
	private LocalDate fin;
	
	@Column(unique = false)
	@NonNull
	private int duree;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Galerie organisateur;
	
	@ManyToMany(mappedBy = "accrochages")
	List<Tableau> oeuvres = new LinkedList<>();
	
	@OneToMany(mappedBy = "lieuDeVente")
	List<Transaction> ventes = new LinkedList<>();

}
