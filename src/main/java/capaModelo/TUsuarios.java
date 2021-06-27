/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// 1 Package
package capaModelo;

/**
 * autor: Ortega Velázquez Martín Emiliano
 * Equipo 10. Programación Orientada a Objetos
 * La clase TUsuarios tiene como objetivo construir y definir un objeto de tipo Usuario
 * que tiene como atributos comunes un nombre de usuario, un telefono y un correo
 * electrónico
 */

// 2 import

// 3 public class
public class TUsuarios {
    
// 4 constructores
public TUsuarios(){
    this.nombreUsuario = " ";
    this.telefono = 0;
    this.CorreoElectronico = " ";
}

// 4.1 Constructor con parámetros

public TUsuarios(String nombreUsuario, int telefono, String CorreoElectronico){

this.nombreUsuario=nombreUsuario;
this.telefono=telefono;
this.CorreoElectronico = CorreoElectronico;

}
    
// 5 propiedades
    
    private String nombreUsuario;
    private int telefono;
    private String CorreoElectronico;
    

// 6 metodos
    
// 7 getters y setters
public String getnombreUsuario(){
    return nombreUsuario;
}
    
public void setnombreUsuario (String nombreUsuario){
    this.nombreUsuario = nombreUsuario;
}

public Integer gettelefono (){
    return telefono;
}

public void settelefono(){
    this.telefono = telefono;
}
   
public String getCorreoElectronico(){
    return CorreoElectronico;
}

public void setCorreoElectronico (String CorreoElectronico){
   this.CorreoElectronico = CorreoElectronico;
}

// cierre de la clase
}


