/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ConvertirNombres {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Solicitar al usuario que ingrese un nombre completo
            System.out.print("Ingresa el nombre completo en minusculas (o escribe 'salir' para terminar): ");
            String nombre = scanner.nextLine();

            // Verificar si el usuario quiere salir
            if (nombre.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }

            // Convertir el nombre a mayúsculas
            String nombreEnMayusculas = nombre.toUpperCase();

            // Mostrar el resultado
            System.out.println("Nombre en mayusculas: " + nombreEnMayusculas);
        }

        // Cerrar el scanner
        scanner.close();
    }
}