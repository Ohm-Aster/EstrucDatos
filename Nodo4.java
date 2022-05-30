/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import java.util.Scanner;

/**
 *
 * @author OhmAster
 */
public class Nodo4 {
    Scanner sc = new Scanner(System.in);
    static class Nodo {
        int id;
        String nombre;
        String marca;
        float precio;
        Nodo sig;
    }
    Nodo fin = null;
    Nodo inicio = null;
    int cont=1;
    
    public void agregar() {
        Nodo temp = new Nodo();
        temp.id=cont;
        System.out.println("agregar el nombre");
        temp.nombre=sc.nextLine();
        System.out.println("agregar el marca ");
        temp.marca=sc.nextLine();
        System.out.println("agregar el precio ");
        temp.precio=sc.nextFloat();
        
        if (inicio == null) {
            inicio = temp;
            inicio.sig = null;
            fin = temp;
        } else {
            fin.sig=temp;
            temp.sig = null;
            fin = temp;
        }
        System.out.println("dato agregado con id: "+ fin.id);
        cont++;
    }
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.print(" " + "[" + actual.id + "]"+" " + "[" + actual.nombre + "]"+" " + "[" + actual.marca + "]"+" " + "[" + actual.precio + "]");
                System.out.println("");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    public void eliminarultimo() {
        System.out.println("dato eliminado: " + inicio.id);
        inicio = inicio.sig;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Nodo4 n = new Nodo4();
        do {
            System.out.println("\n1 add \n"
                    + "2 mostrar \n"
                    + "3 eliminar \n"
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;
                case 2:
                    n.mostrar();
                    break;
                case 3:
                   n.eliminarultimo();
                    break;
                
            }
        } while (opt != 7);
    }
    
}
