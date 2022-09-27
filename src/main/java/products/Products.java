package products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Products {

    @Id
    int productID;
    String name;
    String description;
    BigDecimal price;
    double quantity;


    /**
     * Hibernate (JPA) uses it
     */
    @SuppressWarnings("unused")
    public Products() {
    }

    Products(String description, String name, int productID, BigDecimal price,double quantity) {
        this.description = description;
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.quantity=quantity;
    }

    BigDecimal getPrice() {
        return price;
    }

    void setPrice(BigDecimal price) {
        this.price = price;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getProductID() {
        return productID;
    }

    void setProductID(int productID) {
        this.productID = productID;
    }

    double getQuantity() {
        return quantity;
    }

    void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
