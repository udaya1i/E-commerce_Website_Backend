package ECommerce.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long Id;

}
