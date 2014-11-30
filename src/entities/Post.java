package entities;

import java.io.Serializable;
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
public class Post implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPost;
	private String titre;
	private Date datePost;
	private double budget;
	private int nbPerson;
	private int nbJours;
	private double challenge;
	private String feedback;
	private int notation;
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	@OneToMany(mappedBy="post")
	private List<Road> road;
	@OneToMany(mappedBy="post")
	private List<Media> medias;
	@OneToMany(mappedBy="post")
	private List<Comment> comments;
	public Post() {
		super();
		this.notation=0;
		// TODO Auto-generated constructor stub
	}
	public Long getIdPost() {
		return idPost;
	}
	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public int getNbPerson() {
		return nbPerson;
	}
	public void setNbPerson(int nbPerson) {
		this.nbPerson = nbPerson;
	}
	public int getNbJours() {
		return nbJours;
	}
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	public double getChallenge() {
		return challenge;
	}
	public void setChallenge(double challenge) {
		this.challenge = challenge;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getNotation() {
		return notation;
	}
	public void setNotation(int notation) {
		this.notation = notation;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Road> getRoad() {
		return road;
	}
	public void setRoad(List<Road> road) {
		this.road = road;
	}
	public List<Media> getMedias() {
		return medias;
	}
	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Post(Date datePost,String titre, double budget, int nbPerson, int nbJours,
			double challenge, String feedback, int notation, User user,
			List<Road> road, List<Media> medias, List<Comment> comments) {
		super();
		this.titre=titre;
		this.datePost = datePost;
		this.budget = budget;
		this.nbPerson = nbPerson;
		this.nbJours = nbJours;
		this.challenge = challenge;
		this.feedback = feedback;
		this.notation = notation;
		this.user = user;
		this.road = road;
		this.medias = medias;
		this.comments = comments;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
}
