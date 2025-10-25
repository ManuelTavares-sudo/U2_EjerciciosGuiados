/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colas;

import java.util.Scanner;

/**
 *
 * @author tavar
 */
public class MainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Cola
        Cola<String> colaTareas = new Cola<>();
        int opcion;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Insertar tarea");
            System.out.println("2. Quitar tarea");
            System.out.println("3. Consultar frente");
            System.out.println("4. Consultar size");
            System.out.println("5. Estado de la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a insertar: ");
                    String tarea = teclado.nextLine();
                    colaTareas.insertar(tarea);
                    break;

                case 2:
                    String quitada = colaTareas.quitar();
                    if (quitada != null) {
                        System.out.println("Tarea ejecutada: " + quitada);
                    }
                    break;

                case 3:
                    String frente = colaTareas.frente();
                    if (frente != null) {
                        System.out.println("Tarea al frente: " + frente);
                    }
                    break;

                case 4:
                    System.out.println("Tamaño actual de la cola: " + colaTareas.getTamano());
                    break;

                case 5:
                    colaTareas.mostrarCola();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
    
    
    

