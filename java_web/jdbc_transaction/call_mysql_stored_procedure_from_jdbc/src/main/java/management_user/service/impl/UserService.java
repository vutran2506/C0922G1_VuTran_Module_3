package management_user.service.impl;

import management_user.model.User;
import management_user.repository.IUserRepository;
import management_user.repository.impl.UseRepository;
import management_user.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private  final IUserRepository userRepository = new UseRepository();
    @Override
    public List<User> selectAllUser() {
        return this.userRepository.selectAllUser();
    }

    @Override
    public User selectUser(int id) {
        return this.userRepository.selectUser(id);
    }

    @Override
    public boolean insertUser(User user) {
        return this.userRepository.insertUser(user);
    }

    @Override
    public boolean updateUser(int id, User user) {
        return this.userRepository.updateUser(id,user);
    }

    @Override
    public boolean deleteUser(int id) {
        return this.userRepository.deleteUser(id);
    }

    @Override
    public void addUserTransaction(User user, int[] permisions) {
        this.userRepository.addUserTransaction(user,permisions);

    }
}
