import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MainProductos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String marca, a, producto;
        int id, precio;
        List<Productos> lista = new ArrayList<Productos>();
 
        
            do{
                System.out.print("\nINGRESE EL ID PRODUCTO: ");
                id = sc.nextInt();
                System.out.print("INGRESE EL NOMBRE DEL PRODUCTO: ");
                producto = sc.nextLine();
                System.out.print("INGRESE LA MARCA: ");
                marca = sc.next();
                System.out.print("INGRESE UN PRECIO: $");
                precio = sc.nextInt();
                lista.add(new Productos(id, marca, precio, producto));
                System.out.println("\n¿DESEAS CONTINUAR?\n");
                a = sc.next();
                while(!(a.equals("si") || a.equals("no"))){
                    System.out.println("\n¿DESEAS CONTINUAR?\n");
                    a = sc.next();
                }
            }while(a.equals("si"));

        for(Productos pro : lista){
            System.out.println("ID DEL PRODUCTO: " + pro.getId() + ", MARCA: " + pro.getMarca() + ", PRECIO: $" + pro.getPrecio());
        }
    }
}