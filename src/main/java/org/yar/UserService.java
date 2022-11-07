package org.yar;

public class UserService {

  private UserDao usersDao = new UserDao();

  public UserService() {}

  public User findUser(long id) {
    return usersDao.findById(id);
  }

  public void saveUser(User user) {
    usersDao.save(user);
  }

  public void deleteUser(long id) {
    usersDao.delete(id);
  }

  public void updateUser(User user) {usersDao.update(user);}
}
