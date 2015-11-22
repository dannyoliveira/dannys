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
import model.Setor;


/**
 *
 * @author Danny
 */
public class SetorDAO {
    
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
    
    public void atualizar (Setor s){
        begin();
        em.merge(s);
        commit();        
    }
    
    public void apagar (Setor s){
        begin();
        em.remove(s);
        commit();
    }
    
    public void salvar (Setor s){
        begin();
        em.persist(s);
        commit();
    }
    
    public List <Setor> listar (){
        List<Setor> ls = new ArrayList<Setor>();
        Query query = em.createQuery("select s from Setor s");
        return ls = query.getResultList();
    }
}