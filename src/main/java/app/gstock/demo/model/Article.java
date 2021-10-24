package app.gstock.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/
@Entity
public class Article implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  private String reference;
	  private String nom;
	 /* @ManyToOne
	  @JoinColumn(name="code_categorie")*/
	  private Categorie categorie;
	  private int quant_in_stock;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Article(Long id, String reference, String nom, Categorie categorie, int quant_in_stock) {
		super();
		this.id = id;
		this.reference = reference;
		this.nom = nom;
		this.categorie = categorie;
		this.quant_in_stock = quant_in_stock;
	}


	public String getReference() {
		return reference;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public int getQuant_in_stock() {
		return quant_in_stock;
	}
	public void setQuant_in_stock(int quant_in_stock) {
		this.quant_in_stock = quant_in_stock;
	}
	  
	  

}
