/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

/**
 *
 * 
 * 
 */
public class TUsuarios {
    
// Variables a utilizar
// atributos del usuario
    
    private String nombreUsuario;
    private int telefono;
    private String CorreoElectronico;
    
// Método constructor vacío

public TUsuarios(){
    this.nombreUsuario = " ";
    this.telefono = 0;
    this.CorreoElectronico = " ";
}

//Constructor con parámetros

public TUsuarios(String nombreUsuario, int telefono, String CorreoElectronico){

this.nombreUsuario=nombreUsuario;
this.telefono=telefono;
this.CorreoElectronico = CorreoElectronico;

}

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


}


