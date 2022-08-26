package kata.maximsavin.pp_3_1_1.dao;

import kata.maximsavin.pp_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(int id);

    List<User> listUsers();

    void deleteUser(int id);
}
