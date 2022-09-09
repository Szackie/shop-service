package products;

import java.math.BigDecimal;

class App {
public static void main(String [] args){
    Products product= new Products();
    product.setCodeEAN(1111111111);
    product.setProducer("Mleczkowita");
    product.setName("Mleko na Dzień dobry");
    product.setPrice(BigDecimal.valueOf(4.99));
    Products product2= new Products("Dajno", "Dajno-Mleko",222222222,BigDecimal.valueOf(2.89));
    Products product3= new Products("Krasnyszczaw","Kefir Kwaśna Krowa", 333333333,BigDecimal.valueOf(3.54));
    ProductsRepository repository = new ProductsRepository();
    repository.addProduct(product);
    repository.addProduct(product2);
    repository.addProduct(product3);
    repository.addProduct(new Products("Twoja Kurka","Twoje Jaja",444444444,BigDecimal.valueOf(6.01)));
    repository.addProduct(new Products("Moja Wieś","Dzik przydrożny suchy",555555555,BigDecimal.valueOf(0.50)));



}

}
