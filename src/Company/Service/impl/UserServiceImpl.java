package Company.Service.impl;

import Company.Dao.UserDao;
import Company.Exception.NoMatchIdException;
import Company.Model.User;
import Company.Service.UserService;

import java.util.List;

/**
 * Author GrayCode
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao();

    @Override
    public void addUsermethod(User user) {
        userDao.addUsermethod(user);
    }

    @Override
    public void findUserById(int id) {
        try {
            if (userDao.checkTrueOrFalse(id)) {
                throw new NoMatchIdException("No Match Id in Users ");
            }
            userDao.findUserById(id);
        } catch (NoMatchIdException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Finally is working");
        }
    }

    @Override
    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsersMethod() {
        return userDao.getAllUsersMethod();
    }
}
