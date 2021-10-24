package app.gstock.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Demande implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
      private  EType_Demande type_demande;
      private Date CreateDate;
      private Date ValidateDate;
      private Date RejectDate;
      private EStatus Status;
      private Agent CretedBy;
      private Agent UpdatedBy;
      private Date UpdatedDate;
      private Agent Tiers;
      @ManyToOne 
      @JoinColumn(name="mag_id",referencedColumnName="id")
      private Magasin Magasin;
      
      @OneToMany
      private List<Details> articles = new  ArrayList<>();
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Demande(long id, EType_Demande type_demande, Date createDate, Date validateDate, Date rejectDate,
			EStatus status, Agent cretedBy, Agent updatedBy, Date updatedDate, Agent tiers,
			app.gstock.demo.model.Magasin magasin, List<Details> articles) {
		super();
		this.id = id;
		this.type_demande = type_demande;
		CreateDate = createDate;
		ValidateDate = validateDate;
		RejectDate = rejectDate;
		Status = status;
		CretedBy = cretedBy;
		UpdatedBy = updatedBy;
		UpdatedDate = updatedDate;
		Tiers = tiers;
		Magasin = magasin;
		this.articles = articles;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EType_Demande getType_demande() {
		return type_demande;
	}
	public void setType_demande(EType_Demande type_demande) {
		this.type_demande = type_demande;
	}
	public List<Details> getArticles() {
		return articles;
	}
	public void setArticles(List<Details> articles) {
		this.articles = articles;}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getValidateDate() {
		return ValidateDate;
	}
	public void setValidateDate(Date validateDate) {
		ValidateDate = validateDate;
	}
	public EStatus getStatus() {
		return Status;
	}
	public void setStatus(EStatus status) {
		Status = status;
	}
	public Date getRejectDate() {
		return RejectDate;
	}
	public void setRejectDate(Date rejectDate) {
		RejectDate = rejectDate;
	}
	public Agent getCretedBy() {
		return CretedBy;
	}
	public void setCretedBy(Agent cretedBy) {
		CretedBy = cretedBy;
	}
	public Agent getUpdatedBy() {
		return UpdatedBy;
	}
	public void setUpdatedBy(Agent updatedBy) {
		UpdatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return UpdatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	public Agent getTiers() {
		return Tiers;
	}
	public void setTiers(Agent tiers) {
		Tiers = tiers;
	}
	public Magasin getMagasin() {
		return Magasin;
	}
	public void setMagasin(Magasin magasin) {
		Magasin = magasin;
	}
	
      
      
}
