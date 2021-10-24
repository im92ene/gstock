package app.gstock.demo.model;

import java.io.Serializable;

import javax.persistence.*;
import app.gstock.demo.model.EType_Demande;
@Entity
public class Type_Demande implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
    private EType_Demande type_demande;
	public Type_Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type_Demande(Long id, EType_Demande type_demande) {
		super();
		this.id = id;
		this.type_demande = type_demande;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public EType_Demande getType_demande() {
		return type_demande;
	}
	public void setType_demande(EType_Demande type_demande) {
		this.type_demande = type_demande;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}