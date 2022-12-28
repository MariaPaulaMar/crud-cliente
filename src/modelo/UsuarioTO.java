
package modelo;

import javax.swing.JOptionPane;

public class UsuarioTO {
    private String alias;
    private String nombres;
    private String apellidos;
    private String email;
    private Double celular;
    private String contraseña;
    private String nacimiento;

    public UsuarioTO(String alias, String nombres, String apellidos, 
            String email, String celular, String contraseña, String nacimiento) {
        this.alias = alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        double numCelular = Double.parseDouble(celular);
        this.celular = numCelular;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
    }

    public UsuarioTO(String alias, String nombres) {
        this.alias = alias;
        this.nombres = nombres;

    }

    public UsuarioTO() {
    }
    
    public Object[] toArray(){
        Object[] datos = {alias, nombres, apellidos, email, celular, contraseña, nacimiento};
        return datos;
    }
        
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    public Double getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        double numCelular = Double.parseDouble(celular);
        this.celular = numCelular; 
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
}
