/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

/**
 *
 * @autor Ortega Velázquez Martín Emiliano
 * Equipo 10. Programación Orientada a Objetos
 * La clase TProductos tiene como objetivo definir una contraseña, la cual tiene
 * como atributos un id, una longitud y un tipo de caracter permitido
 */
// 2 import

// 3 public class
public class TContraseñas {
    
// 4 constructores
    public TContraseñas(){
        this.id = 0;
        this.longitud = 0;
        this.tipoCaracteres = " ";
    }
    
// 4.1 Constructor con parámetros
    public TContraseñas(int id, int longitud, String tipoCaracteres){
        this.id = id;
        this.longitud =  longitud;
        this.tipoCaracteres = tipoCaracteres;
        
    }

// 5 propiedades
    private int id;
    private int longitud;
    private String tipoCaracteres;
    
// 6 metodos
    
// 7 getters y setters
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public int getlongitud(){
        return longitud;
    }
    
    public void setlongitud(int longitud){
        this.longitud = longitud;
    }
    
    public String gettipoCaracteres(){
        return tipoCaracteres;
    }
    
    public void settipoCaracteres(String tipoCaracteres){
        this.tipoCaracteres = tipoCaracteres;
    }
// cierre de la clase
}
