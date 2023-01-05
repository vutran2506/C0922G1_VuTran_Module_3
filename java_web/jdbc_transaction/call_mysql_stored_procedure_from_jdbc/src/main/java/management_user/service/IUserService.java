package management_user.service;

import management_user.model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUser();
    User selectUser(int id);
    boolean insertUser(User user);
    boolean updateUser(int id,User user);
    boolean deleteUser(int id);
    void addUserTransaction(User user, int[] permisions);
}
