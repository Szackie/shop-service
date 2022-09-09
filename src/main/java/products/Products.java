package products;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Integer id;
    String name;
    String producer;
    int codeEAN;
    BigDecimal price;



    /**
     * Hibernate (JPA) uses it
     */
    @SuppressWarnings("unused")
    public Products (){}

    Products(String producer, String name, int codeEAN, BigDecimal price) {
        this.producer = producer;
        this.name = name;
        this.codeEAN = codeEAN;
        this.price=price;
    }

    BigDecimal getPrice() {
        return price;
    }

    void setPrice(BigDecimal price) {
        this.price = price;
    }

    Integer getId() {
        return id;
    }

    String getProducer() {
        return producer;
    }

    void setProducer(String producer) {
        this.producer = producer;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getCodeEAN() {
        return codeEAN;
    }

    void setCodeEAN(int codeEAN) {
        this.codeEAN = codeEAN;
    }

}
