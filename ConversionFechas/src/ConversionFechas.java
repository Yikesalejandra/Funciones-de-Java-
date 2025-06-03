/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConversionFechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir el formato de fecha esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.print("Ingresa una fecha en el formato 'YYYY-MM-DD': ");
        String fechaEntrada = scanner.nextLine();

        LocalDate fecha;
        
        // Intentar parsear la fecha ingresada
        try {
            fecha = LocalDate.parse(fechaEntrada, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("La fecha ingresada no es válida. Asegúrate que sigue el formato 'YYYY-MM-DD'.");
            scanner.close();
            return;
        }

        // Calcular una semana después y un mes antes
        LocalDate unaSemanaDespues = fecha.plusWeeks(1);
        LocalDate unMesAntes = fecha.minusMonths(1);

        // Mostrar resultados
        System.out.println("La fecha una semana después es: " + unaSemanaDespues.format(formatter));
        System.out.println("La fecha un mes antes es: " + unMesAntes.format(formatter));

        // Cerrar el escáner
        scanner.close();
    }
}
