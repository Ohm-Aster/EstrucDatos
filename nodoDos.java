/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class nodoDos {
    Scanner sc = new Scanner(System.in);
    static class Nodo {
        String dato;
        Nodo sig;
    }
    Nodo inicio = null;

    public void agregar() {
        Nodo temp;
        System.out.println("agregar el dato ");
        if (inicio == null) {
            inicio = new Nodo();
            inicio.dato = sc.nextLine();//texto
            inicio.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = inicio;
            inicio = temp;
        }
    }
    
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.println(" DATO " + "[" + actual.dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public void eliminarultimo() {
        System.out.println("dato eliminado: " + inicio.dato);
        inicio = inicio.sig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        nodoDos n = new nodoDos();
        do {
            System.out.println("1 add \n"
                    + "2 mostrar \n"
                    + "3 eliminar ultimo\n"
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    //System.out.println("");
                    //String texto
                    n.agregar();
                    break;
                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.eliminarultimo();
                    break;
                case 4:
                   
                    break;
            }
        } while (opt != 5);
    }
}