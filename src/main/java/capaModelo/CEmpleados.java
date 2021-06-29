/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 1 package
package capaModelo;

/**
 * @autor Ortega Velázquez Martín Emiliano
 * Equipo 10. Programación Orientada a Objetos
 * La clase CEmpleados tiene como objetivo definir un empleado, el cual tiene
 * como atributos un id, un puesto, un número de identificación, desde qué año
 * labora conocido como añosTrabajando, tipo de sangre, turno y curp
 */

// 2 import

// 3 public class
public class CEmpleados extends TUsuarios{
    
 // 4 constructores
    public CEmpleados(){
        this.id = 0;
        this.puesto = "";
        this.numeroDeIdentificacion = " ";
        this.aniosLaborando = 0;
        this.turno = " ";
        this.numeroDeSeguridadSocial = 0;
        this.tipoDeSangre = " ";
        this.curp = " ";
    }
    
// 4.1 Constructor con parámetros
    public CEmpleados(int id, String puesto, String numeroDeIdentificacion, int aniosLaborando, String turno, int numeroDeSeguridadSocial, String tipoDeSangre, String curp){
        this.id = id;
        this.puesto =  puesto;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.aniosLaborando = aniosLaborando;
        this.turno = turno;
        this.numeroDeSeguridadSocial = numeroDeSeguridadSocial;
        this.tipoDeSangre = tipoDeSangre;
        this.curp = curp;
        
    }

// 5 propiedades
    private int id;
    private String puesto;
    private String numeroDeIdentificacion;
    private int aniosLaborando;
    private String turno;
    private int numeroDeSeguridadSocial;
    private String tipoDeSangre;
    private String curp;
    
// 6 metodos
    
// 7 getters y setters
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getpuesto(){
        return puesto;
    }
    
    public void setpuesto(String puesto){
        this.puesto = puesto;
    }
    
    public String getnumeroDeIdentificacion(){
        return numeroDeIdentificacion;
    }
    
    public void setnumeroDeIdentificacion(String numeroDeIdentificacion){
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
    
    public int getaniosLaborando(){
    return aniosLaborando;
    }
    
    public void setaniosLaborando(int rfc){
        this.aniosLaborando = aniosLaborando;
    }
    
    public String getturno(){
    return turno;
    }
    
    public void setturno(String turno){
        this.turno = turno;
    }
    
    public int getnumeroDeSeguridadSocial(){
    return numeroDeSeguridadSocial;
    }
    
    public void setnumeroDeSeguridadSocial(int numeroDeSeguridadSocial){
        this.numeroDeSeguridadSocial = numeroDeSeguridadSocial;
    }
    
    public String gettipoDeSangre(){
    return tipoDeSangre;
    }
    
    public void settipoDeSangre(String tipoDeSangre){
        this.tipoDeSangre = tipoDeSangre;
    }
    
    public String getcurp(){
    return curp;
    }
    
    public void setcurp(String curp){
        this.curp = curp;
    }
// cierre de la clase
}

