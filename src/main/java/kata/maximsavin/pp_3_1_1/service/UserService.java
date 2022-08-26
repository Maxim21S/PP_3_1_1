package kata.maximsavin.pp_3_1_1.service;

import kata.maximsavin.pp_3_1_1.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(int id);

    List<User> listUsers();

    void deleteUser(int id);
}
