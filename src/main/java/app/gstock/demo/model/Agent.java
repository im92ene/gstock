package app.gstock.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
/*import javax.persistence.FetchType;
import javax.persistence.ManyToOne;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import app.gstock.demo.model.Role;


@Entity
public class Agent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	
	  private int mat;
	  private String nom;
	  private String code;
	  private String libGrade;
	  @ManyToOne
	  private Role role;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(long id, int mat, String nom, String code, String libGrade, Role role) {
		super();
		this.id = id;
		this.mat = mat;
		this.nom = nom;
		this.code = code;
		this.libGrade = libGrade;
		this.role=role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibGrade() {
		return libGrade;
	}
	public void setLibGrade(String libGrade) {
		this.libGrade = libGrade;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	  
	

}
