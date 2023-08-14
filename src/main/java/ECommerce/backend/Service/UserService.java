package ECommerce.backend.Service;

import ECommerce.backend.Model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

     ResponseEntity<User> createUser(User user);
}
