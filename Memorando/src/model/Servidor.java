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
public class Servidor {
    
    @Id
    private long siape;
    private String senha;
    private String setor;
    private String telefone;

    public Servidor() {
        super();
    }

    public Servidor(long siape, String senha, String setor, String telefone) {
        this.siape = siape;
        this.senha = senha;
        this.setor = setor;
        this.telefone = telefone;
    }

    public long getSiape() {
        return siape;
    }

    public void setSiape(long siape) {
        this.siape = siape;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Setor other = (Setor) obj;
        return true;
    }

    @Override
    public String toString() {
        return "setor{" + "siape=" + siape + ", senha=" + senha + ", setor=" + setor + ", telefone=" + telefone + '}';
    }
        
}
