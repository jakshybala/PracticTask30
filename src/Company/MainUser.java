package Company;

import Company.Model.User;
import Company.Service.UserService;
import Company.Service.impl.UserServiceImpl;

import static Company.Enum.Gender.*;

/**
 * Author GrayCode
 */
public class MainUser {
    static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        User user1 = new User(1, "Alex", MALE);
        User user2 = new User(2, "Melisa", FEMALE);
        User user3 = new User(3, "Jessica", FEMALE);

        userService.addUsermethod(user1);
        userService.addUsermethod(user2);
        userService.addUsermethod(user3);

//        userService.removeUserById(1);

        System.out.println("Get");
        userService.findUserById(4);

        userService.getAllUsersMethod().forEach(System.out::println);

    }
}
