/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author OHMASTER
 */
public class nodoUno {
    
    static class Nodo{
        String dato;
        Nodo sig;
    }
    
    public static void main(String[] args) {
        Nodo fin = null;
        
        fin = new Nodo();
        fin.dato= "A";
        fin.sig= null;
        // A -- unico nodo que se ha agregado a la lista
       mostrar("caso 1",fin); 
       
       Nodo temp;
       
       temp = new Nodo();
       temp.dato = "B";
       temp.sig = fin;
       fin = temp;
       //B A -- agrego el valor "B" antes del nodo "A"
       mostrar("case 2", fin);
       
       temp = new Nodo();
       temp.dato = "C";
       temp.sig = null;
       
       Nodo temp2;
       temp2 = fin;
       
       while(temp2.sig != null)
           temp2 = temp2.sig;
       temp2.sig = temp;
       // B A C -- 
       mostrar("case 3", fin);
      
       
    }
    
    public static void mostrar(String dato, Nodo actual){
        System.out.println("\n"+dato+" ");
        
        while(actual != null){
            System.out.print(actual.dato + " ");
            actual = actual.sig;
        }
    }
}
