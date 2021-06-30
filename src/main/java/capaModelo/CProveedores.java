/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

/**
 * @date 28/06/2021
 * @autor Ortega Velázquez Martín Emiliano
 * @description Equipo 10. Programación Orientada a Objetos
 * La clase CProveedores es un catalogo que tiene como objetivo definir un proveedor, el cual tiene
 * como atributos un id, un nombre, un domicilio fiscal, un rfc, una página web
 * un telefono, y un enlace a linkedin
 */
// 2 import

// 3 public class
public class CProveedores {
    
// 4 constructores
    public CProveedores(){
        this.id = 0;
        this.nombreProveedor = "";
        this.domicilioFiscal = " ";
        this.rfc = " ";
        this.paginaWeb = " ";
        this.telefono = 0;
        this.linkedIn = " ";
    }
    
// 4.1 Constructor con parámetros
    public CProveedores(int id, String nombreProveedor, String domicilioFiscal, String rfc, String paginaWeb, int telefono, String linkedIn){
        this.id = id;
        this.nombreProveedor =  nombreProveedor;
        this.domicilioFiscal = domicilioFiscal;
        this.rfc = rfc;
        this.paginaWeb = paginaWeb;
        this.telefono = telefono;
        this.linkedIn = linkedIn;
        
    }

// 5 propiedades
    private int id;
    private String nombreProveedor;
    private String domicilioFiscal;
    private String rfc;
    private String paginaWeb;
    private int telefono;
    private String linkedIn;
    
// 6 metodos
    
// 7 getters y setters
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getnombreProveedor(){
        return nombreProveedor;
    }
    
    public void setnombreProveedor(String nombreProveedor){
        this.nombreProveedor = nombreProveedor;
    }
    
    public String getdomicilioFiscal(){
        return domicilioFiscal;
    }
    
    public void setdomicilioFiscal(String domicilioFiscal){
        this.domicilioFiscal = domicilioFiscal;
    }
    
    public String getrfc(){
    return rfc;
    }
    
    public void setrfc(String rfc){
        this.rfc = rfc;
    }
    
    public String getpaginaWeb(){
    return paginaWeb;
    }
    
    public void setpaginaWeb(String paginaWeb){
        this.paginaWeb = paginaWeb;
    }
    
    public int gettelefono(){
    return telefono;
    }
    
    public void settelefono(int telefono){
        this.telefono = telefono;
    }
    
    public String getlinkedIn(){
    return linkedIn;
    }
    
    public void setlinkedIn(String linkedIn){
        this.linkedIn = linkedIn;
    }
// cierre de la clase
}

