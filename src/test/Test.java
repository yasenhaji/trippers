package test;

import org.hibernate.SessionFactory;

import dao.DaoImpl;
import dao.IDAO;

import entities.User;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IDAO dao=new DaoImpl();
		User u=dao.getUser(1L);
		System.out.println(u.getUsername());
		u.setUsername("abdeslaam");
		u.setName("test");
		dao.updateUser(u);
		// TODO Auto-generated method stub
		
System.out.println("tesssssssssssssst");
	}

}
