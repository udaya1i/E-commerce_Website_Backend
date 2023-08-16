package ECommerce.backend.Model;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column
    String productCategory;
    @Column
    String productImage;
    @Column
    String productPrice;
    @Column
    String productColor;
    @Column
    String description;
    @Column
    String productName;
    @Column
    String Qty;
    @Column
    String productId;
    @Column
    String userId;

    public void setId(Long id) {
        Id = id;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getId() {
        return Id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getDescription() {
        return description;
    }

    public String getProductName() {
        return productName;
    }

    public String getQty() {
        return Qty;
    }

    public String getProductId() {
        return productId;
    }

    public String getUserId() {
        return userId;
    }

    public Card() {
    }

    public Card(Long id, String productCategory, String productImage, String productPrice, String productColor, String description, String productName, String qty, String productId, String userId) {
        Id = id;
        this.productCategory = productCategory;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productColor = productColor;
        this.description = description;
        this.productName = productName;
        Qty = qty;
        this.productId = productId;
        this.userId = userId;
    }
}
