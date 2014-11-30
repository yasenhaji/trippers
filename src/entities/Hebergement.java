package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Hebergement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHebergement;
	private String type;
	private double cost;
	private double danger;
	@OneToOne(mappedBy="hebergement")
	@PrimaryKeyJoinColumn
	private Place palce;
	public Hebergement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdHebergement() {
		return idHebergement;
	}
	public void setIdHebergement(Long idHebergement) {
		this.idHebergement = idHebergement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getDanger() {
		return danger;
	}
	public void setDanger(double danger) {
		this.danger = danger;
	}
	public Hebergement(String type, double cost, double danger) {
		super();
		this.type = type;
		this.cost = cost;
		this.danger = danger;
	}
	public Place getPalce() {
		return palce;
	}
	public void setPalce(Place palce) {
		this.palce = palce;
	}
}
