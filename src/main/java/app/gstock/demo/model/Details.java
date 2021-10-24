package app.gstock.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
@Entity
public class Details implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	private Long Id;
	@ManyToOne
	private Demande Demande;
	private int  numLig;
	private Article article;
	private String  nameLig;
	private int nbtDemander;
	private  int nbrReel;
	private Agent CretedBy;
    private Agent UpdatedBy;
    private Date UpdatedDate;
    private Date CreateDate;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(Long id, int numLig, Article article, String nameLig, int nbtDemander, int nbrReel, Agent cretedBy,
			Agent updatedBy, Date updatedDate, Date createDate) {
		super();
		Id = id;
		this.numLig = numLig;
		this.article = article;
		this.nameLig = nameLig;
		this.nbtDemander = nbtDemander;
		this.nbrReel = nbrReel;
		CretedBy = cretedBy;
		UpdatedBy = updatedBy;
		UpdatedDate = updatedDate;
		CreateDate = createDate;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getNumLig() {
		return numLig;
	}
	public void setNumLig(int numLig) {
		this.numLig = numLig;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getNameLig() {
		return nameLig;
	}
	public void setNameLig(String nameLig) {
		this.nameLig = nameLig;
	}
	public int getNbtDemander() {
		return nbtDemander;
	}
	public void setNbtDemander(int nbtDemander) {
		this.nbtDemander = nbtDemander;
	}
	public int getNbrReel() {
		return nbrReel;
	}
	public void setNbrReel(int nbrReel) {
		this.nbrReel = nbrReel;
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
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
	

}
