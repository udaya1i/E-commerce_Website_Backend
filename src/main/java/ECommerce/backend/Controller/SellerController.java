package ECommerce.backend.Controller;

import ECommerce.backend.Model.Seller;
import ECommerce.backend.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SellerController {

    @Autowired
    SellerService sellerService;
    @PostMapping("/seller-signup")
    public ResponseEntity<?> createSeller(@RequestBody Seller seller){
        try {
            if (seller!=null){
                this.sellerService.createSeller(seller);
                return ResponseEntity.ok("Seller Registered Successfully");
            }else {
                return ResponseEntity.ok("Incomplete Data");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
            return ResponseEntity.ok("error1");
        }
    }
}
