package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class User_Language implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	@ManyToOne
	@JoinColumn(name="idLangue")
	private Language langue;
	private double niveau;
	public User_Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_Language(User user, Language langue, double niveau) {
		super();
		this.user = user;
		this.langue = langue;
		this.niveau = niveau;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Language getLangue() {
		return langue;
	}
	public void setLangue(Language langue) {
		this.langue = langue;
	}
	public double getNiveau() {
		return niveau;
	}
	public void setNiveau(double niveau) {
		this.niveau = niveau;
	}
	
}
