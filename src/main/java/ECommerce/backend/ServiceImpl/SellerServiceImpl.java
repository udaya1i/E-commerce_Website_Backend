package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.Seller;
import ECommerce.backend.Repository.SellerRepository;
import ECommerce.backend.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public ResponseEntity<Seller> createSeller(Seller seller) {
        this.sellerRepository.save(seller);
       return ResponseEntity.ok(seller);
    }

    @Override
    public Seller loginUser(String user, String password) {
        try{
           return this.sellerRepository.findByUsernameAndPassword(user, password);
        }catch (Exception ex){
        System.out.println(ex);
        return null;
    }
    }
}
