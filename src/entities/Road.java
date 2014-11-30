package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Road implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRoad;
	@ManyToOne
	@JoinColumn(name="idDepart")
	private Place depart;
	@ManyToOne
	@JoinColumn(name="idArrive")
	private Place arrive;
	private String moyenTransport;
	private double cost;
	@ManyToOne
	@JoinColumn(name="idPost")
	private Post post;
	public Road(Place depart, Place arrive, String moyenTransport, double cost,
			Post post) {
		super();
		this.depart = depart;
		this.arrive = arrive;
		this.moyenTransport = moyenTransport;
		this.cost = cost;
		this.post = post;
	}
	public Road() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdRoad() {
		return idRoad;
	}
	public void setIdRoad(Long idRoad) {
		this.idRoad = idRoad;
	}
	public Place getDepart() {
		return depart;
	}
	public void setDepart(Place depart) {
		this.depart = depart;
	}
	public Place getArrive() {
		return arrive;
	}
	public void setArrive(Place arrive) {
		this.arrive = arrive;
	}
	public String getMoyenTransport() {
		return moyenTransport;
	}
	public void setMoyenTransport(String moyenTransport) {
		this.moyenTransport = moyenTransport;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
}
