package com.mycompany.tp2lab;

import java.util.Scanner;

public class TP2Lab {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre.");
        
        String nombre = scanner.nextLine();
        
       if (nombre.equalsIgnoreCase("ignacio") || nombre.equalsIgnoreCase("jonathan")) {
            System.out.println("Bienvenido, " + nombre + ".");
        } else {
            System.out.println("Su nombre no está en nuestra lista.");
        }
    }
}
