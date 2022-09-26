/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg5.lista.doblemente.ligada;

import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class Tarea5ListaDoblementeLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listita=new ListaDoble();
        int opcion=0,elemento;
        do{
            try{    
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo al Inicio\n"
                +"2. Agregar un Nodo al Final \n"
                + "3. Mostrar la Lista de Inicio a Fin\n"
                +"4. Mostrar la Lista de Fin a Inicio\n"
                +"5. Salir\n"
                + "Que deseas Hacer?","Menú de Opociones",
                JOptionPane.INFORMATION_MESSAGE));
                swtich(opcion){
                case 1:
                elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el elemento del Nodo","Agregando Nodo al Inicio",
                JOPane.INFORMARTION_MESSAGE));
                listita.agregarAlInicio(elemento);
                    break;
                 case 2:
                 elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el elemento del Nodo","Agregando Nodo al Final",
                JOPane.INFORMARTION_MESSAGE));
                listita.agregarAlFinal(elemento);
                    break;
                 case 3:
                      if(!listita.estVacia()){
                      listita.mostrarListaInicioFin();
            }else{
            JOptionPane.showMessageDialog (null, "No Hay Nodos Aun",
                      "Fiin",JOptionPane.INFORMATION_MESSAGE);
            }
                    break;
                 case 4:
                 if(!listita.estVacia()){
                      listita.mostrarListaFinInicio();
            }else{
            JOptionPane.showMessageDialog (null, "No Hay Nodos Aun",
                      "Fiin",JOptionPane.INFORMATION_MESSAGE);
            }
                     break;
                 case 5:
                      JOptionPane.showMessageDialog (null, "Aplicacion Finzalizada",
                      "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                     break;
                  default:
                  JOptionPane.showMessageDialog (null, "La Opcion no esta en el Menu",
                      "Incorrecto",JOptionPane.INFORMATION_MESSAGE);
               }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
            while(opcion!=5);
        }
        
    }
    
}
