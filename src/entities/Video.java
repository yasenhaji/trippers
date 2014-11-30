package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("video")
public class Video extends Media{
	private String duree;

	public Video(String duree) {
		super();
		this.duree = duree;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
