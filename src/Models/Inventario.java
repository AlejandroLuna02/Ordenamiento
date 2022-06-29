package Models;


import java.util.Scanner;

public class Inventario {
     static Producto[] listaProductos;
     static Producto producto;
     static Producto aux;

     public void registrar(){
          Scanner entrada = new Scanner(System.in);
          int id;
          String nombre;
          int stock;
          int cantidad = 5;

          listaProductos = new Producto[cantidad];

          for (int i = 0; i < cantidad; i++){
               System.out.println("Ingrese el id del producto: ");
               id = entrada.nextInt();
               System.out.println("Ahora el nombre: ");
               nombre = entrada.next();
               System.out.println("Ingrese el stock: ");
               stock = entrada.nextInt();
               producto = new Producto(id, nombre, stock);
               listaProductos[i] = producto;
          }
          System.out.println("Ok tu registro ha sido exitoso");
     }

     public static void ordenar(){
               int i, j;

               for (i = 0; i <listaProductos.length - 1; i++) {
                    for (j = 0; j < listaProductos.length - i - 1; j++) {
                         if (listaProductos[j + 1].getId() < listaProductos[j].getId()) {
                              aux = listaProductos[j + 1];
                              listaProductos[j + 1] = listaProductos[j];
                              listaProductos[j]= aux;
                         }
                    }
               }
               for (int a = 0; a <listaProductos.length; a++){
                    System.out.println("---REGISTRO EXISTOSO---");
                    System.out.println("id: "+ listaProductos[i].getId());
                    System.out.println("Cantidad: " + listaProductos[i].getStock());
               }

     }

     public static void visualizar(){
          for (int i = 0; i < listaProductos.length; i++){
               System.out.println("--- TU REGISTRO FUE EXITOSO ---");
               System.out.println("--- este es tu registro: ---");
               System.out.println("Id del producto: " + listaProductos[i].getId());
               System.out.println("Nombre: " + listaProductos[i].getNombre());
               System.out.println("Cantidad: " + listaProductos[i].getStock());
          }
     }


}


