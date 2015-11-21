/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Danny
 */
@Entity
public class Login {
    
    @Id 
    private long Id;
    private String senha;
    private String email;

    public Login() {
        super();
    }

    
    public Login(long Id, String senha, String email) {
        this.Id = Id;
        this.senha = senha;
        this.email = email;
    }
    
     public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        return true;
    }

    @Override
    public String toString() {
        return "login{" + "Id=" + Id + ", senha=" + senha + ", email=" + email + '}';
    }
    
    
    
}
