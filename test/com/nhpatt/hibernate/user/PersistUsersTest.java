package com.nhpatt.hibernate.user;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.nhpatt.hibernate.utils.HibernateTest;

public class PersistUsersTest extends HibernateTest {

	// private User saveNewUser() {
	// Session session = getSession();
	// Transaction transaction = session.getTransaction();
	// transaction.begin();
	// User user = new User("Luis", "Garc�a");
	// session.persist(user);
	// transaction.commit();
	// session.close();
	// return user;
	// }
	//
	// @Test
	// public void saveUserWithGeneratedIdTest() {
	// User user = saveNewUser();
	// assertNotNull(user);
	// assertNotNull(user.getId());
	// }
	//
	// @Test
	// public void updateUserTest() {
	// User user = saveNewUser();
	// String newCoolName = "Juan";
	//
	// Session session = getSession();
	// Transaction transaction = session.getTransaction();
	// transaction.begin();
	// User updateUser = (User) session.get(User.class, user.getId());
	// updateUser.setName(newCoolName);
	// session.update(updateUser);
	// transaction.commit();
	// session.close();
	//
	// session = getSession();
	// User updatedUser = (User) session.get(User.class, user.getId());
	// session.close();
	//
	// assertNotNull(updatedUser);
	// assertNotNull(newCoolName, updatedUser);
	// }
	//
	// @Test
	// public void deleteUserTest() {
	// User user = saveNewUser();
	//
	// Session session = getSession();
	// Transaction transaction = session.getTransaction();
	// transaction.begin();
	// User deleteUser = (User) session.get(User.class, user.getId());
	// session.delete(deleteUser);
	// transaction.commit();
	// session.close();
	//
	// session = getSession();
	// User deletedUser = (User) session.get(User.class, user.getId());
	// session.close();
	//
	// assertNull(deletedUser);
	// }

}
