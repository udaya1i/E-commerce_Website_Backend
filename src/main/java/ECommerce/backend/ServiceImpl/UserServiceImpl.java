package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.User;
import ECommerce.backend.Repository.UserRepository;
import ECommerce.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(User user) {
        this.userRepository.save(user);
        return ResponseEntity.ok(user);
    }
}
