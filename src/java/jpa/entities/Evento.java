/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Casa
 */
@Entity
@Table(name = "evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findByNome", query = "SELECT e FROM Evento e WHERE e.nome = :nome")
    , @NamedQuery(name = "Evento.findBySigla", query = "SELECT e FROM Evento e WHERE e.sigla = :sigla")
    , @NamedQuery(name = "Evento.findByArea", query = "SELECT e FROM Evento e WHERE e.area = :area")
    , @NamedQuery(name = "Evento.findByInstitui", query = "SELECT e FROM Evento e WHERE e.institui = :institui")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "sigla")
    private String sigla;
    @Size(max = 30)
    @Column(name = "area")
    private String area;
    @Size(max = 255)
    @Column(name = "institui")
    private String institui;

    public Evento() {
    }

    public Evento(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstitui() {
        return institui;
    }

    public void setInstitui(String institui) {
        this.institui = institui;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sigla != null ? sigla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.sigla == null && other.sigla != null) || (this.sigla != null && !this.sigla.equals(other.sigla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Evento[ sigla=" + sigla + " ]";
    }
    
}
