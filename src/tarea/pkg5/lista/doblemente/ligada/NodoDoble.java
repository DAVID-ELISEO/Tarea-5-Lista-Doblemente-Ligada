/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5.lista.doblemente.ligada;

/**
 *
 * @author hector
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;
    //Constructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el,null,null);
    }
    //Constructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
        dato=el;
        siguiente=s;
        anterior=a;
        
           
    }

    NodoDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    }
}
