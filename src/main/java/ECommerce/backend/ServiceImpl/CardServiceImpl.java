package ECommerce.backend.ServiceImpl;

import ECommerce.backend.Model.Card;
import ECommerce.backend.Repository.CardRepository;
import ECommerce.backend.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card postCardData(Card card) {
        try{
            return this.cardRepository.save(card);
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public List<Card> getCardData(Card card) {
        return this.cardRepository.findAll();
    }
}
