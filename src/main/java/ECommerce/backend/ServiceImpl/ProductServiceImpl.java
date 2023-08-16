package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.Product;
import ECommerce.backend.Repository.ProductRepository;
import ECommerce.backend.Service.ProductService;
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
        Product product1 = this.productRepository.findById(id).get();
        product1.setProductCatagory(product.getProductCatagory());
        product1.setProductColor(product.getProductColor());
        product1.setProductName(product.getProductName());
        product1.setProductImage(product.getProductImage());
        product1.setDescription(product.getDescription());
        product1.setProductPrice(product.getProductPrice());
        this.productRepository.save(product1);
        return product1;
    }
    @Override
    public Optional<Product> getProductById(Long id){
     return this.productRepository.findById(id);
    }

    @Override
    public void deleteProductById(Long id) {
    this.productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductByName(String name) {
    return this.productRepository.findProductsByProductName(name);
    }
}
