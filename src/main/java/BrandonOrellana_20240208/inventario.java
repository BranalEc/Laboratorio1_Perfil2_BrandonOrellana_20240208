package BrandonOrellana_20240208;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class inventario {

    public void StockInventario() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Stock del inventario");
                System.out.println("Actualizar stock: ");
                mapa.put("Papel",6);
                mapa.put("PC",10);
                mapa.put("Mouse",15);
                mapa.put("Teclado",5);
                System.out.println("Stock inicial " + mapa);

                System.out.println("Listado de claves con valores menores a 10:");
                for (String clave : mapa.keySet()) {
                int valor = mapa.get(clave);
                if (valor < 10) {
                System.out.println(clave + " = " + valor);
                }
                System.out.println(mapa);
                }

                System.out.println("Cuántos prodcutos quiere actualizar?");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < cantidad; i++) {
                    System.out.print("Ingresa la clave para actualizar su valor: ");
                    String clave = sc.nextLine();

                    if (mapa.containsKey(clave)) {
                        System.out.print("Ingresa el nuevo valor para la clave '" + clave + "': ");
                        int nuevoValor = sc.nextInt();
                        sc.nextLine();

                        mapa.put(clave, nuevoValor);
                        System.out.println("Valor actualizado: " + clave + " = " + nuevoValor);
                    } else {
                        System.out.println("La clave '" + clave + "' no existe en el mapa. No se actualizó.");
                    }
                }
                    System.out.println("Stock actulizado: " + mapa);

                for (Map.Entry<String, Integer > entrada: mapa.entrySet()){
                    System.out.println("Clave: " + entrada.getKey() + ", Valor " + entrada.getValue());
                }

        }
}
