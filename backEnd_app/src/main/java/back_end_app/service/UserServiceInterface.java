package back_end_app.service;

import back_end_app.domaine.Role;
import back_end_app.domaine.User;

import java.util.List;

public interface UserServiceInterface {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
