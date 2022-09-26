/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5.lista.doblemente.ligada;

import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class ListaDoble {
    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio=fin=null;
    }
    //Metodo para saber cuando la lista está vacía
    public boolean estVacia(){
        return inicio==null;
    }
   //Metodos para agregar nodos al Final
    public void agregarAlFinal(int el){
        if (!estVacia()){
            fin=new NodoDoble(el, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    //Metodo para agregar al inicio
    public void agregarAlInicio(int el){
        if (!estVacia()){
            inicio=new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin(){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos= datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
                          
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de Inicio a Fin",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Metodo para mostrar la lista de Fin a Inicio
    public void mostrarListaFinInicio(){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos= datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
                          
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de Inicio a Fin",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}


