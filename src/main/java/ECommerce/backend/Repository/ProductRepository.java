package ECommerce.backend.Repository;

import ECommerce.backend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select * from product_table where product_name like ?1%", nativeQuery = true)
    List<Product> findProductsByProductName(String productName);
}
