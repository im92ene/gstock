package app.gstock.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
/*import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;*/
import javax.persistence.Entity;

import javax.persistence.Id;

//import app.gstock.demo.model.ERole;
@Entity
public class Role implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	private Long id; 
    @Column(length = 20)
    private String name;

    public Role() {

    }

    public Role(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}