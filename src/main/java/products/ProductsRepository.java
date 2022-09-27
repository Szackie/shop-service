package products;
import products.HibernateUtil;
import java.util.List;
import java.util.Optional;

public class ProductsRepository {

    public Products addProduct(Products newProduct){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        session.persist("products",newProduct);

        transaction.commit();
        session.close();
        return newProduct;
    }


    public void deleteProduct(Integer id){
        var session= HibernateUtil.getSessionFactory().openSession();
        var transaction=session.beginTransaction();

        var product = session.load(Products.class,id);
        session.delete("products",product);


        transaction.commit();
        session.close();
    }

    public List<Products> findAll(){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("from products.Products",Products.class).list();
        transaction.commit();
        session.close();

        return result;
    }
    public Optional<Products> findByEAN(Integer codeEAN){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction=session.beginTransaction();

        var result = Optional.ofNullable(session.get(Products.class,codeEAN));

        transaction.commit();
        session.close();
        return result;
    }


}