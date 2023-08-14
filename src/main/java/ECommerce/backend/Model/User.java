package ECommerce.backend.Model;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long Id;
    @Column
    String name;
    @Column
    String email;
    @Column
    String password;

}
