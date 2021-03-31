package galerie.entity;

import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@ToString @NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Personne {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = false)
	@NonNull
	private String nom;
	
	@Column(unique = false)
	@NonNull
	private String adresse;
}
