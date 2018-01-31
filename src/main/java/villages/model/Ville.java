package villages.model;

public class Ville {
	private Integer id;
	private String code;
	private String libelle;
	
	public Ville(Integer id, String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
