/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauricvotecounter;

/**
 *
 * @author miral
 */
public class candidatura {
    /*propiedades de cada candidatura
    nombre del partido
    número de votos
    
    */
    
    //primero creamos los atributos
    String nombre ;
    int votos ;
    
    //gets y sets para acceder a los atributos
        //nombre
        public String getNombre()
        {
            return this.nombre ;
        }
        public void setNombre (String nombre)
        {
            this.nombre = nombre;
        }
        
        //votos
        public int getVotos ()
        {
            return this.votos;
        }
        public void setVotos (int votos)
        {
            this.votos = votos ;
        }
                
    //constructores: modificador de acceso y nombre de la clase (que se necesita para candidatura)
        //constructor para los valores del usuario
        public candidatura (String nombre , int votos) 
        {
            this.nombre = nombre ;
            this.votos = votos ;
        }
        //constructor (valores por defecto) en caso de que el usuario no introduzca valores
        public candidatura ()
        {
            this.nombre = "sin nombre" ;
            this.votos = 0 ;
        }
        
        
        
    }
