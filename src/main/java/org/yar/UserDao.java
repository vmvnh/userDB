package org.yar;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

  public User findById(long id) {
    return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
  }

  public void save(User user) {
    Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    Transaction tx1 = session.beginTransaction();
    session.save(user);
    tx1.commit();
    session.close();
  }

  public void update(User user) {
    Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    Transaction tx1 = session.beginTransaction();
    session.update(user);
    tx1.commit();
    session.close();
  }

  public void delete(long id) {
    var user = findById(id);
    Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    Transaction tx1 = session.beginTransaction();
    session.delete(user);
    tx1.commit();
    session.close();
  }
}
