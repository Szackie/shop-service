package shop;

import products.Products;
import products.ProductsRepository;

import java.util.Date;

class Shop {

    int id;
    Products product;
    int quantity;
    Date expireDate;
    Date deliveryDate;
    int batchNumber;

    /**
     * Hibernate (JPA) uses it
     */
    @SuppressWarnings("unused")
    public Shop() {
    }

    Shop(Products product, int quantity, Date expireDate, Date deliveryDate, int batchNumber) {
        this.product = product;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.deliveryDate = deliveryDate;
        this.batchNumber = batchNumber;


    }
}
