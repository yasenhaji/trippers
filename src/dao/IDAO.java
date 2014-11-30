package dao;

import java.util.List;

import entities.Comment;
import entities.Food;
import entities.Hebergement;
import entities.Language;
import entities.Media;
import entities.Place;
import entities.Post;
import entities.Road;
import entities.Suivre;
import entities.User;
import entities.User_Language;

public interface IDAO {
	public void addComment(Comment c);
	public void addFood(Food f);
	public void addHebergement(Hebergement h);
	public void addLanguage(Language l);
	public void addMedia(Media m);
	public void addRoad(Road r);
	public void addSuivre(Suivre s);
	public void addUserLanguage(User_Language ul);
	public void addUser(User u);
	public void addPost(Post p);
	public void addPlace(Place p);


	public void updateComment(Comment c);
	public void updateFood(Food f);
	public void updateHebergement(Hebergement h);
	public void updateLanguage(Language l);
	public void updateMedia(Media m);
	public void updateRoad(Road r);
	public void updateSuivre(Suivre s);
	public void updateUserLanguage(User_Language ul);
	public void updateUser(User u);
	public void updatePost(Post p);
	public void updatePlace(Place p);
	
	public void deleteUser(Long id_user);
	public void deletePost(Long id_post);
	public void deleteMedia(Long id_media);
	public void deleteRoad(Long id_road);
	public void deleteSuivre(Long id_suivre);
	public void deleteUser_Laguage(Long id_user_laguage);
	public void deleteComment(Long id_comment);
	public void deleteFood(Long id_food);
	public void deletePlace(Long id_place);
	public void deleteLanguage(Long id_language);
	public void deleteHebergement(Long id_heberegement);
	
	public User getUser(Long id_user);
	public Post getPost(Long id_post);
	public Food getFood(Long id_food);
	public Hebergement getHebergement(Long id_hebergement);
	public Language getLanguage(Long id_language);
	public Media getmedia(Long id_media);
	public Comment getComment(Long id_comment);
	public Place getPlace(Long id_place);
	public Suivre getSuivre(Long id_suivre);
	public Road getRoad(Long id_road);
	public User_Language getUser_Language(Long user_laguage);
	
	public List<Comment> getComments();
	public List<Food> getFoods();
	public List<Hebergement> getHebergements();
	public List<Language> getLanguages();
	public List<Media> getMedias();
	public List<Place> getPlaces();
	public List<Post> getPosts();
	public List<Road> getRoads();
	public List<Suivre> getSuivres();
	public List<User_Language> getUserLanguages();
	public List<User> getUsers();
	
	public List<User> getUserbymc(String mc_user);
	public List<Place> getPlacebymc(String mc_place);
	public List<Post> getPostbymc(String mc_post);
}
