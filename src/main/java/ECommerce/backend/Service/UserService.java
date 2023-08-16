package ECommerce.backend.Service;

import ECommerce.backend.Model.User;

public interface UserService {
    public User createUser(User user);
    public User loginUser(String user, String password);
}
