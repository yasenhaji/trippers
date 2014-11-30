package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtil;

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

public class DaoImpl implements IDAO {
	private SessionFactory sessionFactory;
	public DaoImpl() {
		sessionFactory=HibernateUtil.sessionFactory;
	}
	
	//Ajout
	@Override
	public void addComment(Comment c) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public void addFood(Food f) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(f);
		session.getTransaction().commit();
	}

	@Override
	public void addHebergement(Hebergement h) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(h);
		session.getTransaction().commit();
	}

	@Override
	public void addLanguage(Language l) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(l);
		session.getTransaction().commit();
	}

	@Override
	public void addMedia(Media m) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(m);
		session.getTransaction().commit();
	}

	@Override
	public void addRoad(Road r) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(r);
		session.getTransaction().commit();
	}

	@Override
	public void addSuivre(Suivre s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}

	@Override
	public void addUserLanguage(User_Language ul) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(ul);
		session.getTransaction().commit();

	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();

	}

	@Override
	public void addPost(Post p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();

	}

	@Override
	public void addPlace(Place p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();

	}
	
	//mise a jours

	@Override
	public void updateComment(Comment c) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
	}

	@Override
	public void updateFood(Food f) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(f);
		session.getTransaction().commit();

	}

	@Override
	public void updateHebergement(Hebergement h) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(h);
		session.getTransaction().commit();

	}

	@Override
	public void updateLanguage(Language l) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(l);
		session.getTransaction().commit();

	}

	@Override
	public void updateMedia(Media m) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(m);
		session.getTransaction().commit();

	}

	@Override
	public void updateRoad(Road r) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(r);
		session.getTransaction().commit();

	}

	@Override
	public void updateSuivre(Suivre s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();

	}

	@Override
	public void updateUserLanguage(User_Language ul) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(ul);
		session.getTransaction().commit();

	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();

	}

	@Override
	public void updatePost(Post p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();

	}

	@Override
	public void updatePlace(Place p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();

	}

	
	// suppression
	@Override
	public void deleteUser(Long id_user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		User u=(User)session.get(User.class,id_user);
		session.delete(u);
		session.getTransaction().commit();

	}

	@Override
	public void deletePost(Long id_post) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Post p=(Post)session.get(Post.class,id_post);
		session.delete(p);
		session.getTransaction().commit();

	}

	@Override
	public void deleteMedia(Long id_media) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Media m=(Media)session.get(Media.class,id_media);
		session.delete(m);
		session.getTransaction().commit();

	}

	@Override
	public void deleteRoad(Long id_road) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Road r=(Road)session.get(Road.class,id_road);
		session.delete(r);
		session.getTransaction().commit();

	}

	@Override
	public void deleteSuivre(Long id_suivre) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Suivre s=(Suivre)session.get(Suivre.class,id_suivre);
		session.delete(s);
		session.getTransaction().commit();

	}

	@Override
	public void deleteUser_Laguage(Long id_user_laguage) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		User_Language ul=(User_Language)session.get(User_Language.class,id_user_laguage);
		session.delete(ul);
		session.getTransaction().commit();

	}

	@Override
	public void deleteComment(Long id_comment) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Comment c=(Comment)session.get(Comment.class,id_comment);
		session.delete(c);
		session.getTransaction().commit();

	}

	@Override
	public void deleteFood(Long id_food) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Food f=(Food)session.get(User.class,id_food);
		session.delete(f);
		session.getTransaction().commit();

	}

	@Override
	public void deletePlace(Long id_place) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Place p=(Place)session.get(Place.class,id_place);
		session.delete(p);
		session.getTransaction().commit();

	}

	@Override
	public void deleteLanguage(Long id_language) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Language l=(Language)session.get(Language.class,id_language);
		session.delete(l);
		session.getTransaction().commit();

	}

	@Override
	public void deleteHebergement(Long id_heberegement) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Hebergement h=(Hebergement)session.get(Hebergement.class,id_heberegement);
		session.delete(h);
		session.getTransaction().commit();

	}
// Getters
	@Override
	public User getUser(Long id_user) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User c=(User) session.get(User.class, id_user);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Post getPost(Long id_post) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Post c=(Post) session.get(Post.class, id_post);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Food getFood(Long id_food) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Food c=(Food) session.get(Food.class, id_food);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Hebergement getHebergement(Long id_hebergement) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Hebergement c=(Hebergement) session.get(Hebergement.class, id_hebergement);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Language getLanguage(Long id_language) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Language c=(Language) session.get(Language.class, id_language);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Media getmedia(Long id_media) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Media c=(Media) session.get(Media.class, id_media);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Comment getComment(Long id_comment) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Comment c=(Comment) session.get(Comment.class, id_comment);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Place getPlace(Long id_place) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Place c=(Place) session.get(Place.class, id_place);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Suivre getSuivre(Long id_suivre) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Suivre c=(Suivre) session.get(Suivre.class, id_suivre);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public Road getRoad(Long id_road) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Road c=(Road) session.get(Road.class, id_road);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public User_Language getUser_Language(Long user_laguage) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User_Language c=(User_Language) session.get(User_Language.class, user_laguage);
		if(c!=null){
			session.getTransaction().commit();
			return c;
		}
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<Comment> getComments() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Comment C";
		Query query = session.createQuery(hql);
		List<Comment> results=new ArrayList<Comment>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Food> getFoods() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Food F";
		Query query = session.createQuery(hql);
		List<Food> results=new ArrayList<Food>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Hebergement> getHebergements() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Hebergement H";
		Query query = session.createQuery(hql);
		List<Hebergement> results=new ArrayList<Hebergement>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Language> getLanguages() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Language L";
		Query query = session.createQuery(hql);
		List<Language> results=new ArrayList<Language>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Media> getMedias() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Media M";
		Query query = session.createQuery(hql);
		List<Media> results=new ArrayList<Media>();
		results = query.list();
		session.getTransaction().commit();
		return results;

	}

	@Override
	public List<Place> getPlaces() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Place P";
		Query query = session.createQuery(hql);
		List<Place> results=new ArrayList<Place>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Post> getPosts() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Post P";
		Query query = session.createQuery(hql);
		List<Post> results=new ArrayList<Post>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Road> getRoads() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Road R";
		Query query = session.createQuery(hql);
		List<Road> results=new ArrayList<Road>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Suivre> getSuivres() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Suivre S";
		Query query = session.createQuery(hql);
		List<Suivre> results=new ArrayList<Suivre>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<User_Language> getUserLanguages() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM User_Language L";
		Query query = session.createQuery(hql);
		List<User_Language> results=new ArrayList<User_Language>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<User> getUsers() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM User U";
		Query query = session.createQuery(hql);
		List<User> results=new ArrayList<User>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<User> getUserbymc(String mc_user) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM User U WHERE U.name LIKE :x or U.username LIKE :x";
		
		Query query = session.createQuery(hql);
		query.setParameter("x", "%"+mc_user+"%");
		List<User> results=new ArrayList<User>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public List<Place> getPlacebymc(String mc_place) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Place U WHERE U.name LIKE :x";
		Query query = session.createQuery(hql);
		query.setParameter("x", "%"+mc_place+"%");
		List<Place> results=new ArrayList<Place>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}
	@Override
	public List<Post> getPostbymc(String mc_post) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Post p WHERE p.titre LIKE :x";
		Query query = session.createQuery(hql);
		query.setParameter("x", "%"+mc_post+"%");
		List<Post> results=new ArrayList<Post>();
		results = query.list();
		session.getTransaction().commit();
		return results;
	}
	

}
