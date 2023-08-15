package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.Product;
import ECommerce.backend.Repository.ProductRepository;
import ECommerce.backend.Service.ProductService;
import org.hibernate.hql.internal.ast.tree.ResolvableNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public ResponseEntity<?> addNewProdcut(Product product) {
        this.productRepository.save(product);
        return ResponseEntity.ok("Product Saved Successfully");
    }

    @Override
    public List<Product> getAllProduct() {
       return this.productRepository.findAll();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }


}
