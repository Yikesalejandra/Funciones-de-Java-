/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ContadorPalabras {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto largo
        System.out.print("Ingresa un texto largo: ");
        String texto = scanner.nextLine();

        // Contar cuántas veces aparece la palabra "ingeniería"
        String palabraBuscada = "ingenieria";
        int contador = contarPalabra(texto, palabraBuscada);

        // Mostrar el resultado
        System.out.println("La palabra \"" + palabraBuscada + "\" aparece " + contador + " veces en el texto.");

        // Cerrar el scanner
        scanner.close();
    }

    // Método para contar la cantidad de veces que aparece una palabra en un texto
    public static int contarPalabra(String texto, String palabra) {
        // Dividir el texto en palabras
        String[] palabras = texto.split("\\W+"); // Utiliza una expresión regular para dividir por cualquier carácter no alfanumérico
        int contador = 0;

        // Contar las ocurrencias de la palabra buscada
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) { // Comparar ignorando mayúsculas y minúsculas
                contador++;
            }
        }

        return contador;
    }
}
