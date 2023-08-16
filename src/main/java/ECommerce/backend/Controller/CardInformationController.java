package ECommerce.backend.Controller;

import ECommerce.backend.Model.Card;
import ECommerce.backend.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CardInformationController {
    @Autowired
    private CardService cardService;
    @PostMapping("/post-card-data")
    public ResponseEntity<String> uploadCardData(@RequestBody Card card){
        try{
            this.cardService.postCardData(card);
           return ResponseEntity.ok("Product added to card successfully");
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body("Internal Server Error");
        }
    }
    @GetMapping("get-card-data")
    public List<Card> getCardData(@RequestBody Card card){
        try{
            return this.cardService.getCardData(card);
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
