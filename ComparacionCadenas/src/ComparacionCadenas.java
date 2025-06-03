/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ComparacionCadenas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las dos cadenas
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();
        
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        // Comparar longitudes
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas no tienen la misma longitud.");
        }

        // Comparar el contenido de las cadenas
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es igual.");
        } else {
            System.out.println("El contenido de ambas cadenas es diferente.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
