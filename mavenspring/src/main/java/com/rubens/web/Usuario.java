/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rubens.web;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author T107
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGING")
    private String loging;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADMIN_ROL")
    private Character adminRol;

    public Usuario() {
    }
/**Este cnstructor inicializa un objeto de tipo
 * usuario a generarse como mapeo a la tabla de usuario
 * 
 * @param loging 
 */
    
    

    public Usuario(String loging) {
        this.loging = loging;
    }

    public String getLoging() {
        return loging;
    }

    public void setLoging(String loging) {
        this.loging = loging;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getAdminRol() {
        return adminRol;
    }

    public void setAdminRol(Character adminRol) {
        this.adminRol = adminRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loging != null ? loging.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.loging == null && other.loging != null) || (this.loging != null && !this.loging.equals(other.loging))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rubens.web.Usuario[ loging=" + loging + " ]";
    }
    
}
