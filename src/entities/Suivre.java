package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Suivre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSuivre;
	@ManyToOne
	@JoinColumn(name="idFollower")
	private User follower;
	@ManyToOne
	@JoinColumn(name="idFollowed")
	private User followed;
	public Suivre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suivre(User follower, User followed) {
		super();
		this.follower = follower;
		this.followed = followed;
	}
	public Long getIdSuivre() {
		return idSuivre;
	}
	public void setIdSuivre(Long idSuivre) {
		this.idSuivre = idSuivre;
	}
	public User getFollower() {
		return follower;
	}
	public void setFollower(User follower) {
		this.follower = follower;
	}
	public User getFollowed() {
		return followed;
	}
	public void setFollowed(User followed) {
		this.followed = followed;
	}
}
