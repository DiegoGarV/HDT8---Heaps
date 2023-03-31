/*
* Autores:
* Diego García 22404
* César López 22535
* Fecha: 31/03/2023
* Hoja de Trabajo #8
* Main
*/

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        PriorityQueueI<Proceso> priorityQueue;
        Lector lector = new Lector();

        System.out.println("Escoja la forma en la que quiere que se implemente el Priority Queue  \n1. Vector  \n2. Java Collection Framework \nMarque el número de la opción que desea:");
        while (true) {
            try {
                op = Integer.parseInt(teclado.nextLine());
                if (op == 1 || op == 2) {
                    break;
                } else {
                    System.out.println("\nRespuesta incorrecta. Por favor, coloque el número de la opción con la que quiere trabajar.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nRespuesta incorrecta. Por favor, coloque el número de la opción con la que quiere trabajar.");
            }
        }

        if (op == 1) {
            priorityQueue = new VectorHeap<>();
        } else {
            priorityQueue = new PriorityQueueJCF<>();
        }

        System.out.println("\nObteniendo Procesos");
        List<List<String>> lineas = lector.readTextFile();
        for (List<String> linea : lineas) {
            Proceso proceso = new Proceso(linea.get(0), linea.get(1), Integer.parseInt(linea.get(2)));
            System.out.println(proceso.toString());
            priorityQueue.add(proceso);
        }

        System.out.println("\nOrdenando Procesos");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }

        teclado.close();
    }
}
