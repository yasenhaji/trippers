package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Food implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFood;
	private boolean pecerie;
	private boolean feu;
	private boolean restauration;
	@OneToOne(mappedBy="food")
	@PrimaryKeyJoinColumn
	private Place place;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(boolean pecerie, boolean feu, boolean restauration, Place place) {
		super();
		this.pecerie = pecerie;
		this.feu = feu;
		this.restauration = restauration;
		this.place=place;
	}
	public Long getIdFood() {
		return idFood;
	}
	public void setIdFood(Long idFood) {
		this.idFood = idFood;
	}
	public boolean isPecerie() {
		return pecerie;
	}
	public void setPecerie(boolean pecerie) {
		this.pecerie = pecerie;
	}
	public boolean isFeu() {
		return feu;
	}
	public void setFeu(boolean feu) {
		this.feu = feu;
	}
	public boolean isRestauration() {
		return restauration;
	}
	public void setRestauration(boolean restauration) {
		this.restauration = restauration;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	
}
