package Company.Service;

import Company.Model.User;

import java.util.List;

/**
 * Author GrayCode
 */
public interface UserService {

    void addUsermethod(User user);
    void findUserById(int id);
    void removeUserById(int id);
    List<User> getAllUsersMethod();

}
