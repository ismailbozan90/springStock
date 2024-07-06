package com.demo.stock.DataAccess;

import com.demo.stock.Entities.Product;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository
public class HibernateProductDal implements IProductDal{


    private EntityManager entityManager;

   @Autowired
    public HibernateProductDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    public void add(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    public void delete(Product product) {
        Session session = entityManager.unwrap(Session.class);
        Product productToDelete = session.get(Product.class, product.getId());
        session.saveOrUpdate(productToDelete);
    }

    @Override
    public void update(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    public Product getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Product.class, id);
    }
}
