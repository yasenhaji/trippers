package entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="mediaType",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue("Media")
public class Media implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedia;
	private String src;
	private double taille;
	@ManyToOne
	@JoinColumn(name="idPost")
	private Post post;
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Media(Long idMedia, String src, double taille, Post post) {
		super();
		this.idMedia = idMedia;
		this.src = src;
		this.taille = taille;
		this.post = post;
	}
	public Long getIdMedia() {
		return idMedia;
	}
	public void setIdMedia(Long idMedia) {
		this.idMedia = idMedia;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
}
