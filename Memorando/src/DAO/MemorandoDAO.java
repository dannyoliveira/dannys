/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Memorando;


/**
 *
 * @author Danny
 */
public class MemorandoDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Memorando");
    
    EntityManager em = emf.createEntityManager();
    
    public void begin(){
        em.getTransaction().begin();
    }
    
    public void commit(){
        em.getTransaction().commit();
    }
    
    public void rollback(){
        em.getTransaction().rollback();
    }
    
    public void close(){
        em.close();
        emf.close();
    }
    
    //editar, apagar, salvar, listar
    
    public void atualizar (Memorando m){
        begin();
        em.merge(m);
        commit();        
    }
    
    public void apagar (Memorando m){
        begin();
        em.remove(m);
        commit();
    }
    
    public void salvar (Memorando m){
        begin();
        em.persist(m);
        commit();
    }
    
    public List <Memorando> listar (){
        List<Memorando> lm = new ArrayList<Memorando>();
        Query query = em.createQuery("select m from Memorando m");
        return lm = query.getResultList();
    }
            
}