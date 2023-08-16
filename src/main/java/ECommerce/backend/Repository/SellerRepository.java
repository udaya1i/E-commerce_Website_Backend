package ECommerce.backend.Repository;

import ECommerce.backend.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
    @Query(value = "select * from seller_table where email =?1 and password = ?2", nativeQuery = true )
    Seller findByUsernameAndPassword (String username, String password);
}
