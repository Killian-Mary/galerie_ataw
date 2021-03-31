package galerie.entity;

import java.util.LinkedList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@ToString(callSuper = true) @NoArgsConstructor
public class Artiste extends Personne {

	@Column(unique = true)
	@NonNull
	private String biographie;
	
	@OneToMany(mappedBy = "titre")
	private LinkedList<Tableau> oeuvres;
}
