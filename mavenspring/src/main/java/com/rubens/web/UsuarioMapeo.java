

package com.rubens.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")

public class UsuarioMapeo {
  /*
    CREATE TABLE USUARIO(
LOGING VARCHAR(80),
PASSWORD VARCHAR(40),
ADMIN_ROL CHAR(1),
 PRIMARY KEY(LOGING)
);


    En el maeo de entidades se recomienda 
    1. Emplementar construccion por defecto
    2.Constructor que inicializa todos los atributos
    3.Sobresribir el metodo to String
    4.Sobreescribir el metd equals y el hascode
    */  
    @Id
    @Column(name="LOGING")        
    private String LOGING;
    @Column(name="PASSWORD") 
    private String  PASSWORD;
    @Column (name="ADMIN_ROL")
    private Character ADMIN_ROL;

    public UsuarioMapeo() {
    }
  

    public String getLOGING() {
        return LOGING;
    }

    public void setLOGING(String LOGING) {
        this.LOGING = LOGING;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Character getADMIN_ROL() {
        return ADMIN_ROL;
    }

    public void setADMIN_ROL(Character ADMIN_ROL) {
        this.ADMIN_ROL = ADMIN_ROL;
    }

    @Override
    public String toString() {
        return "UsuarioMapeo{" + "LOGING=" + LOGING + ", PASSWORD=" + PASSWORD + ", ADMIN_ROL=" + ADMIN_ROL + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.LOGING != null ? this.LOGING.hashCode() : 0);
        hash = 73 * hash + (this.PASSWORD != null ? this.PASSWORD.hashCode() : 0);
        hash = 73 * hash + (this.ADMIN_ROL != null ? this.ADMIN_ROL.hashCode() : 0);
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
        final UsuarioMapeo other = (UsuarioMapeo) obj;
        if ((this.LOGING == null) ? (other.LOGING != null) : !this.LOGING.equals(other.LOGING)) {
            return false;
        }
        if ((this.PASSWORD == null) ? (other.PASSWORD != null) : !this.PASSWORD.equals(other.PASSWORD)) {
            return false;
        }
        if (this.ADMIN_ROL != other.ADMIN_ROL && (this.ADMIN_ROL == null || !this.ADMIN_ROL.equals(other.ADMIN_ROL))) {
            return false;
        }
        return true;
    }

   
}
