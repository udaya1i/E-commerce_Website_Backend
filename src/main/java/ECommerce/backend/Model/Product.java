package ECommerce.backend.Model;

import javax.persistence.*;

@Entity
@Table (name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column
    String productCatagory;
    @Column
    String productName;
    @Column
    String productColor;
    @Column
    String productPrice;
    @Column
    String description;
    @Column
    String productImage;

    public void setId(Long id) {
        Id = id;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Long getId() {
        return Id;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getProductImage() {
        return productImage;
    }

    public Product() {
    }

    public Product(Long id, String productCatagory, String productName, String productColor, String productPrice, String description, String productImage) {
        Id = id;
        this.productCatagory = productCatagory;
        this.productName = productName;
        this.productColor = productColor;
        this.productPrice = productPrice;
        this.description = description;
        this.productImage = productImage;
    }
}
