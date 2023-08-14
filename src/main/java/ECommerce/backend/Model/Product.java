package ECommerce.backend.Model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column
    String category;
    @Column
    String productName;
    @Column
    String productColor;
    @Column
    String productPrice;
    @Column
    String productDescription;
    @Column
    String image;

}
