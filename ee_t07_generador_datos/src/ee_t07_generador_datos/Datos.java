/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t07_generador_datos;

/**
 *
 * @author Juan Antonio Juarez Olivera
 */
public class Datos {
  String nombre;
  String apellido;
  int edad;
  String telefono;
  String correo;
  
  public Datos(String nombre,String apellido,int edad,String telefono,String correo){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.telefono=telefono;
    this.correo=correo;
  }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String email) {
        this.correo = correo;
    }
  
}
