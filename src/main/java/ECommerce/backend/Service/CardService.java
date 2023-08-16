package ECommerce.backend.Service;

import ECommerce.backend.Model.Card;

import java.util.List;

public interface CardService {
    public Card postCardData(Card card);
    public List<Card> getCardData(Card  card);
}
