package ECommerce.backend.Controller;

import ECommerce.backend.Model.Seller;
import ECommerce.backend.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
public class SellerController {

    @Autowired
    SellerService sellerService;
    @PostMapping("/seller-signup")
    public ResponseEntity<?> createSeller(@RequestBody Seller seller){
        try {
            if (seller.getEmail().length()>0&& seller.getPassword().length()>0 && seller.getName().length()>0){
                this.sellerService.createSeller(seller);
                return ResponseEntity.ok("Seller Registered Successfully");
            }else {
                return ResponseEntity.badRequest().body("Incomplete Data");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
            return ResponseEntity.internalServerError().body("error1");
        }
    }
}
