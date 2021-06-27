/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 1 Package
package capaModelo;

/**
 *
 * @autor Ortega Velázquez Martín Emiliano
 * Equipo 10. Programación Orientada a Objetos
 * La clase TProductos tiene como objetivo definir un producto, el cual tiene como
 * atributos un id, un nombre de producto, una clasificación, y un año de fabricación
 */
// 2 import

// 3 public class
public class TProductos {
    
// 4 constructores
    public TProductos(){
        this.id = 0;
        this.nombreProducto = " ";
        this.clasificacion = " ";
        this.añoFabricacion = 0;
    }
    
// 4.1 Constructor con parámetros
    public TProductos(int id, String nombreProducto, String clasificacion, int añoFabricacion){
        this.id = id;
        this.nombreProducto =  nombreProducto;
        this.clasificacion = clasificacion;
        this.añoFabricacion = añoFabricacion;
        
    }

// 5 propiedades
    private int id;
    private String nombreProducto;
    private String clasificacion;
    private int añoFabricacion;
    
// 6 metodos
    
// 7 getters y setters
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getnombreProducto(){
        return nombreProducto;
    }
    
    public void setnombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    
    public String getclasificacion(){
        return clasificacion;
    }
    
    public void setclasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }
    
    public int getañoFabricacion(){
        return añoFabricacion;
    }
    
    public void setañoFabricacion(int añoFabricacion){
        this.añoFabricacion = añoFabricacion;
    }
}
