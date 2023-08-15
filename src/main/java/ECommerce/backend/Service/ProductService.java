package ECommerce.backend.Service;

import ECommerce.backend.Model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public ResponseEntity<?> addNewProdcut(Product product);
    public List<Product> getAllProduct();
    public Product  updateProduct(Long id, Product product);
}
