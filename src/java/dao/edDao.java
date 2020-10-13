/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import jpa.entities.Ed;
import jpa.entities.Evento;

/**
 *
 * @author Casa
 */
public class edDao {
     private EntityManager em;
    
    public edDao() {
    }
        
    public void salva(Ed e) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(e);
        et.commit();
        em.close();
    }
    
    Ed recupera(Long id) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Ed e = em.find(Ed.class, id);
        et.commit();
        em.close();
        return e;
    }
    
    List<Evento> buscaSobrenome(String snome) {
        String jpqlQuery = "SELECT e FROM Entrada e where e.sobrenome = :sn";
        em = JPAUtil.getEM();
        Query query = em.createQuery(jpqlQuery);
        query.setParameter("sn", snome);
        List<Evento> e = query.getResultList();
        em.close();
        return e;
    }
    
    
}
