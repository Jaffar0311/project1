package com.revature.daos;

import com.revature.model.User;
import java.util.List;

public interface UserDao {

    public boolean createUser(User user);
    public List<User> getAllUsers();
    public User getUserById(int id);
    public boolean updateUsers(User user);
    public User getUserByUsernameAndPassword(String username, String password);

}