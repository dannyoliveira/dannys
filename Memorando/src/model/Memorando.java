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
public class Memorando {
    
    @Id
    private long id;
    private String data;
    private String emissor;
    private String destino;
    private String assunto;

    public Memorando() {
        super();
    }
    
    public Memorando(long id, String data, String emissor, String destino, String assunto) {
    this.id = id;
    this.data = data;
    this.emissor = emissor;
    this.destino = destino;
    this.assunto = assunto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
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
        final Memorando other = (Memorando) obj;
        return true;
    }

    @Override
    public String toString() {
        return "memorando{" + "id=" + id + ", data=" + data + ", emissor=" + emissor + ", destino=" + destino + ", assunto=" + assunto + '}';
    }
    
}