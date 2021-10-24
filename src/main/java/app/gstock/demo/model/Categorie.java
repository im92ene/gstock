package app.gstock.demo.model;

import java.io.Serializable;


import javax.persistence.Entity;
/*import javax.persistence.OneToMany;
import javax.persistence.CascadeType;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Categorie implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	 
	private int code_categorie;
	  private String nom_categorie;
	  @ManyToOne
	  private Categorie categoriePere;
	  /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie")*/
	  //private Set<Categorie> categorie = new HashSet<>();
	  public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Categorie(long id, int code_categorie, String nom_categorie, Categorie categorie) {
		super();
		this.id = id;
		this.code_categorie = code_categorie;
		this.nom_categorie = nom_categorie;
		this.categoriePere = categorie;
	}
		
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCode_categorie() {
		return code_categorie;
	}
	public void setCode_categorie(int code_categorie) {
		this.code_categorie = code_categorie;
	}
	public String getNom_categorie() {
		return nom_categorie;
	}
	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}
	 public Categorie getCategoriePere() {
			return categoriePere;
		}
		public void setCategoriePere(Categorie categoriePere) {
			this.categoriePere = categoriePere;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	
}
