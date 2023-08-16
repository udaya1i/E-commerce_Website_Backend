package ECommerce.backend.Service;

import ECommerce.backend.Model.Seller;
import org.springframework.http.ResponseEntity;

public interface SellerService {
    public ResponseEntity<Seller> createSeller(Seller seller);
    public Seller loginUser(String user, String password);
}
