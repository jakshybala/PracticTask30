package Company.Dao;

import Company.Model.User;

import java.util.*;

/**
 * Author GrayCode
 */
public class UserDao {

    List<User> users = new ArrayList<>();

    public void addUsermethod(User user) {
        users.add(user);
    }

    public void findUserById(int id) {
      users.stream().filter(user -> user.getId() == id).forEach(System.out::println);
    }

    public void removeUserById(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    public List<User> getAllUsersMethod() {
        return users.stream().toList();
    }

    public boolean checkTrueOrFalse(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().isEmpty();
    }
}
