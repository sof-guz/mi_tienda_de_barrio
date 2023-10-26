package org.example;
import org.example.Model.Product;
import org.example.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    private static List<Product> products = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            clearConsole();
            showMenu();
            System.out.print("Seleccione la opción: ");
            choice = scanner.nextInt();
            handleUserChoice(choice);
        }while(choice != 7);
    }

    private static void handleUserChoice(int choice){
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                enterUser();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                removeProduct();
                break;
            case 4:
                listProducts();
                break;
            case 5:
                updateProduct();
                break;
            case 6:
                searchProduct();
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
                System.out.print("Presione Enter para continuar...");
                scanner.nextLine();
                break;
        }
    }
    private static void showMenu() {
        System.out.println("-------- Administrador Mi Tienda de Barrio --------");
        System.out.println("-------- Menu De Opciones -------");
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Listar Productos");
        System.out.println("5. Actualizar Producto");
        System.out.println("6. Buscar Producto");
        System.out.println("7. Salir");
    }
    private static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static void showMessage(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }

    private static void enterUser() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los detalles del usuario:");
        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        // Crear un nuevo usuario
        User user = new User(username, password);
        users.add(user); // Agregar el usuario a la lista global
        System.out.println("Usuario creado: " + user);
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }
    private static void addProduct() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los detalles del nuevo producto:");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Descripción: ");
        String description = scanner.nextLine();
        System.out.print("Etiqueta: ");
        String tag = scanner.nextLine();
        System.out.print("Proveedor: ");
        String supplier = scanner.nextLine();

        // Crear un nuevo producto
        Product product = new Product(name, description, tag, supplier);
        products.add(product); // Agregar el producto a la lista global

        System.out.println("Producto añadido: " + product);
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }

    private static void removeProduct() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String productName = scanner.nextLine();
        // Buscar y eliminar el producto de la lista global
        Product productToRemove = findProductByName(productName);
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Producto eliminado: " + productName);
        } else {
            System.out.println("Producto no encontrado: " + productName);
        }
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }
    private static Product findProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    private static void updateProduct() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Opcion aun no programada");
        scanner.nextLine();
    }

    private static void listProducts() {
        clearConsole();
        System.out.println("-------- Lista de Productos --------");

        if (products.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.printf("%-20s %-30s %-15s %-20s%n", "Nombre", "Descripción", "Etiqueta", "Proveedor");
            System.out.println("------------------------------------------------------------");
            for (Product product : products) {
                System.out.printf("%-20s %-30s %-15s %-20s%n",
                        product.getName(), product.getDescription(), product.getTag(), product.getSupplier());
            }
        }

        System.out.print("Presione Enter para continuar...");
        new Scanner(System.in).nextLine();
    }

    private static void searchProduct() {
        clearConsole();
        showMessage("Opcinón para buscar un producto");
    }
}


