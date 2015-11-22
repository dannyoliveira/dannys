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
import model.Login;


/**
 *
 * @author Danny
 */
public class LoginDAO {
    
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
    
    public void atualizar (Login l){
        begin();
        em.merge(l);
        commit();        
    }
    
    public void apagar (Login l){
        begin();
        em.remove(l);
        commit();
    }
    
    public void salvar (Login l){
        begin();
        em.persist(l);
        commit();
    }
    
    public List <Login> listar (){
        List<Login> ll = new ArrayList<Login>();
        Query query = em.createQuery("select l from Login l");
        return ll = query.getResultList();
    }
}