package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.User;
import ECommerce.backend.Repository.UserRepository;
import ECommerce.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }
}
