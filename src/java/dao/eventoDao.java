/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import jpa.entities.Evento;

/**
 *
 * @author Casa
 */
public class eventoDao {
    
   
         private EntityManager em;
    
    public eventoDao() {
    }
        
    public void salva(Evento e) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(e);
        et.commit();
        em.close();
        
    }
    
  public  Evento recupera(String chave) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Evento e = em.find(Evento.class, chave);
        et.commit();
        em.close();
        return e;
    }
    
  //  List<Evento> listaUsuarios = em.createQuery("from Evento e").getResultList();   
   public List<Evento> listar() {
       return em.createNamedQuery("Evento.findAll").getResultList();
      
        //em = JPAUtil.getEM();
       // Query query = em.createQuery("SELECT e from Evento e");
       // List<Evento> e = query.getResultList();
        //em.close();
        //return e;
        
        // return em.createQuery("SELECT e from Evento e").getResultList();
    }
     public Evento buscarPorChavePrimaria(String chave)
    {
      return em.find(Evento.class, chave);
      
    }
  public void excluir(Evento obj) throws Exception {
        
       
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
            em.close();
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
