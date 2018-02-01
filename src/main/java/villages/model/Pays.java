package villages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pays {

	@Id
	@GeneratedValue
	private int id;
	@Column(length = 30)
	private String code;
	@Column(length = 30)
	private String libelle;
	
	
	public Pays() {
		super();
	}
	
	public Pays(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	public Pays(int id, String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
