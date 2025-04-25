import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println(" ____MENU____");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Cambiar nombre");
            System.out.println("4. Ver todos los nombres");
            System.out.println("5. Salir");
            System.out.print("Escribe una opcion : ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                System.out.print("Escribe el nombre que quieres agregar: ");
                String nuevo = entrada.nextLine();
                nombres.add(nuevo);
                System.out.println("Nombre guardado");
            }

            if (opcion == 2) {
                System.out.print("Escribe el nombre que quieres borrar: ");
                String borrar = entrada.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equals(borrar)) {
                        nombres.remove(i);
                        encontrado = true;
                        System.out.println("Nombre borrado.");
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("No encontre ese nombre.");
                }
            }

            if (opcion == 3) {
                System.out.print("Escribe el nombre que quieres cambiar: ");
                String viejo = entrada.nextLine();
                boolean cambiado = false;

                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equals(viejo)) {
                        System.out.print("Escribe el nuevo nombre: ");
                        String nuevoNombre = entrada.nextLine();
                        nombres.set(i, nuevoNombre);
                        cambiado = true;
                        System.out.println("Nombre cambiado.");
                        break;
                    }
                }

                if (!cambiado) {
                    System.out.println("No encontre ese nombre.");
                }
            }

            if (opcion == 4) {
                System.out.println(" Lista de nombres ");
                if (nombres.isEmpty()) {
                    System.out.println("No hay nombres guardados.");
                } else {
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i));
                    }
                }
            }

            if (opcion == 5) {
                System.out.println("Gracias por usar el programa");
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Esa opcion no existe.");
            }
        }

        entrada.close();
    }
}