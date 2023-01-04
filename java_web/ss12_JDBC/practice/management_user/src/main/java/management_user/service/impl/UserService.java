package management_user.service.impl;

import management_user.model.Users;
import management_user.repository.IUserRepository;
import management_user.repository.impl.UserRepository;
import management_user.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository userRepository = new UserRepository();
    @Override
    public List<Users> selectAllUser() {
       return this.userRepository.selectAllUser();

    }

    @Override
    public Users selectById(int id) {
        return this.userRepository.selectById(id);
    }

    @Override
    public boolean insertUser(Users users) {
        return this.userRepository.insertUser(users);
    }

    @Override
    public boolean updateUser(int id, Users users) {
        return this.userRepository.updateUser(id,users);
    }

    @Override
    public boolean deleteUser(int id) {
        return this.userRepository.deleteUser(id);
    }

    @Override
    public List<Users> sortByNameUser() {
        return this.userRepository.sortByNameUser();
    }

    @Override
    public List<Users> searchByCountry(String country) {
        return this.userRepository.searchByCountry(country);
    }
}
