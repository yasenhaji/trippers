package entities;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String name;
	private boolean sexe;
	private String email;
	private String username;
	private String password;
	private String ville;
	private String pays;
	private String avatar;
	private int experience;
	@OneToMany(mappedBy="follower")
	private List<Suivre> following;
	@OneToMany(mappedBy="followed")
	private List<Suivre> followers;
	@OneToMany(mappedBy="user")
	private List<User_Language> langages;
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	@OneToMany(mappedBy="user")
	private List<Comment> comments;
	public User(String name, boolean sexe, String email,
			String username, String password, String ville, String pays,
			String avatar, int experience, List<Suivre> following,
			List<Suivre> followers, List<User_Language> langages,
			List<Post> posts, List<Comment> comments) {
		super();
		this.name = name;
		this.sexe = sexe;
		this.email = email;
		this.username = username;
		this.password = password;
		this.ville = ville;
		this.pays = pays;
		this.avatar = avatar;
		this.experience = experience;
		this.following = following;
		this.followers = followers;
		this.langages = langages;
		this.posts = posts;
		this.comments = comments;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return idUser;
	}
	public void setId(Long id) {
		this.idUser = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSexe() {
		return sexe;
	}
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<Suivre> getFollowing() {
		return following;
	}
	public void setFollowing(List<Suivre> following) {
		this.following = following;
	}
	public List<Suivre> getFollowers() {
		return followers;
	}
	public void setFollowers(List<Suivre> followers) {
		this.followers = followers;
	}
	public List<User_Language> getLangages() {
		return langages;
	}
	public void setLangages(List<User_Language> langages) {
		this.langages = langages;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
