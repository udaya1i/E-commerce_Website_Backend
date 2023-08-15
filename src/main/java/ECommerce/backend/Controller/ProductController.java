package ECommerce.backend.Controller;

import ECommerce.backend.Model.Product;
import ECommerce.backend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add-new-product")
    public ResponseEntity<?> addNewProduct(@RequestBody Product product ){
        try{
            if ((product.getProductCatagory().length()>0
                    && product.getProductColor().length()>0
                    && product.getProductImage().length()>0
                    && product.getProductPrice().length()>0
                    && product.getDescription().length()>0
                    && product.getProductName().length()>0)
            ){
                this.productService.addNewProdcut(product);
                return ResponseEntity.ok("Product Added successfully!");
            }else {
                return ResponseEntity.badRequest().body("Incomplete Data!!");
            }
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseEntity.internalServerError().body("Internal server error!!!");
        }
    }
    @GetMapping("/get-all-product")
    public ResponseEntity<?>  getAllProduct(){
        try{
         if (this.productService.getAllProduct().isEmpty()){
             return ResponseEntity.ok("There is no product available ");
         }else {
             return ResponseEntity.ok(this.productService.getAllProduct());
         }
        }catch (Exception ex){
            System.out.println(ex);
           return ResponseEntity.badRequest().body("Internal Server Error");        }
    }
    @PutMapping("/update-product/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product){
    try {
        this.productService.updateProduct(id, product);
        return ResponseEntity.ok("Product Updated Successfully");
    }catch (Exception ex){
          return  ResponseEntity.internalServerError().body("Internal Server Error");
    }
    }
}
