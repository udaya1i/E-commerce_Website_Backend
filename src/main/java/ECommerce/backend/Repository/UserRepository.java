package ECommerce.backend.Repository;

import ECommerce.backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from user_table where user_email = ?1 and user_password = ?2", nativeQuery = true)
    User findByUsernameAndPassword(String email, String password);
}
