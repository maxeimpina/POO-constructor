/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.constructor;

/**
 *
 * En la clase identidad se definen los atributos dni, nombre y apellido 
 * junto con el metodo que los mostrara 
 */
public class identidad {
    
    int dni;
    String nombre;
    String apellido;
    int edad;
    

    //se crea constructor ppal
public identidad (){
        
    this.dni = 0;
    this.nombre = "-";
    this.apellido = "-"; 
    this.edad = 0;
            }
    
public identidad (int dni){
    this();    //trae los atributos seteados en el constructor ppal (para ver tocar ctrl+click)
    this.dni = dni;
    /*
    this.nombre = "";
    this.apellido = "";*/
            }
    
public identidad (int dni, String nombre){
    this(dni);
    this.nombre = nombre;
            }

public identidad (int dni, String nombre, String apellido){
    this(dni, nombre);      //recibe los atributos ya pasados
    //this.nombre = nombre; //ya pasado el la linea de arriba, efecto cascada
    this.apellido = apellido;
            }

public identidad (int dni, String nombre, String apellido,int edad){
    this (dni,nombre,apellido);
    this.edad = edad;
}
        


    
public void mostrar(){
    
    System.out.println("DNI:"+dni);
    System.out.println("Nombre: "+nombre);
    System.out.println("Apellido: "+apellido);    
    System.out.println("Edad: "+edad);    
        }
        
        
}