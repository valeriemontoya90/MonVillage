package villages.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ville")
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String pays;
	
	public Ville() {
		super();
	}
	
	public Ville(Long id, String nom, String pays) {
		super();
		this.id = id;
		this.nom = nom;
		this.pays = pays;
	}
	public Ville(String nom, String pays) {
		this.nom = nom;
		this.pays = pays;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", pays=" + pays + "]";
	}
}
