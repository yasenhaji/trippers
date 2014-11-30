package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Place implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPlace;
	private String name;
	private double x;
	private double y;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Hebergement hebergement;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Food food;
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Place(String name, double x, double y, Hebergement hebergement,
			Food food) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.hebergement = hebergement;
		this.food = food;
	}
	public Long getIdPlace() {
		return idPlace;
	}
	public void setIdPlace(Long idPlace) {
		this.idPlace = idPlace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Hebergement getHebergement() {
		return hebergement;
	}
	public void setHebergement(Hebergement hebergement) {
		this.hebergement = hebergement;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	
}
