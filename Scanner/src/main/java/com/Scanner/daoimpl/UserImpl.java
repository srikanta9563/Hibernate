package com.Scanner.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Scanner.Entity.UserClass;
import com.Scanner.dao.UserDao;
import com.Scanner.hibernateUtil.UserUtil;

public class UserImpl implements UserDao{
public void addUser() {
	Session session = UserUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	long user_id;
	String fn,ln,em;
	int age;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter user id : ");
	user_id = s.nextLong();
	System.out.println("Enter user's first name : ");
	fn = s.next();
	System.out.println("Enter user's last name : ");
	ln = s.next();
	System.out.println("Enter user's email : ");
	em = s.next();
	System.out.println("Enter user's age : ");
	age = s.nextInt();
	UserClass u = new UserClass();
//	u.setId(user_id);
//	u.setFirstName(fn);
//	u.setLastName(ln);
//	u.setEmail(em);
//	u.setAge(age);
	session.save(u);
	t.commit();
	System.out.println("User record inserted successfully");
	session.close();
}
public void readUser() {
	Session session = UserUtil.getSessionFactory().openSession();
	long i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter user id : ");
	i = s.nextLong();
	UserClass w =session.get(UserClass.class,i);
	System.out.println("User id :" + w.getId()+"User FirstName : "+w.getFirstName()+"User lastname : "+w.getLastName()+"User email : "+w.getEmail()+"User age : "+w.getAge());
	session.close();
}
public void updateUser() {
	Session session = UserUtil.getSessionFactory().openSession();
	Scanner s = new Scanner(System.in);
	Transaction t = session.beginTransaction();
	System.out.println("Enter user id : ");
	long j = s.nextLong();
	UserClass w = session.get(UserClass.class,j);
	System.out.println("Enter your Updated email : ");
	String eml = s.next();
	w.setEmail(eml);
	session.update(w);
	t.commit();
	System.out.println("Updated successfylly");
	session.close();
}
public void deleteUser() {
	Session session = UserUtil.getSessionFactory().openSession();
	Scanner s = new Scanner(System.in);
	Transaction t = session.beginTransaction();
	System.out.println("Enter user id : ");
	long k = s.nextLong();
	UserClass w = session.get(UserClass.class, k);
	session.delete(k);
	t.commit();
	System.out.println("Deleted successfylly");
	session.close();
}
}
