
package Model;

public class Usuario {
    private String Nombre;
    private String Paterno;
    private String Usuario;
    private String Pasword;
    private char Rol_Admin;

    public String getNombre() {
        return Nombre;
    }

    public Usuario(String Nombre, String Paterno, String Usuario, String Pasword, char Rol_Admin) {
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.Usuario = Usuario;
        this.Pasword = Pasword;
        this.Rol_Admin = Rol_Admin;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPasword(String Pasword) {
        this.Pasword = Pasword;
    }

    public char getRol_Admin() {
        return Rol_Admin;
    }

    public void setRol_Admin(char Rol_Admin) {
        this.Rol_Admin = Rol_Admin;
    }
    
    
}
