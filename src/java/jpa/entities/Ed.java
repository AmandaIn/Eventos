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
@Table(name = "ed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ed.findAll", query = "SELECT e FROM Ed e")
    , @NamedQuery(name = "Ed.findByNumero", query = "SELECT e FROM Ed e WHERE e.numero = :numero")
    , @NamedQuery(name = "Ed.findByAno", query = "SELECT e FROM Ed e WHERE e.ano = :ano")
    , @NamedQuery(name = "Ed.findByDataIni", query = "SELECT e FROM Ed e WHERE e.dataIni = :dataIni")
    , @NamedQuery(name = "Ed.findByDataFim", query = "SELECT e FROM Ed e WHERE e.dataFim = :dataFim")
    , @NamedQuery(name = "Ed.findBySede", query = "SELECT e FROM Ed e WHERE e.sede = :sede")
    , @NamedQuery(name = "Ed.findByPais", query = "SELECT e FROM Ed e WHERE e.pais = :pais")})
public class Ed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 30)
    @Column(name = "ano")
    private String ano;
    @Size(max = 30)
    @Column(name = "dataIni")
    private String dataIni;
    @Size(max = 30)
    @Column(name = "dataFim")
    private String dataFim;
    @Size(max = 30)
    @Column(name = "sede")
    private String sede;
    @Size(max = 30)
    @Column(name = "pais")
    private String pais;

    public Ed() {
    }

    public Ed(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDataIni() {
        return dataIni;
    }

    public void setDataIni(String dataIni) {
        this.dataIni = dataIni;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ed)) {
            return false;
        }
        Ed other = (Ed) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Ed[ numero=" + numero + " ]";
    }
    
}
