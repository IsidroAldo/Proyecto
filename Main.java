import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//IMPORTAMOS NUESTRA LIBRERIA "SCANNER"
class Main{//CREAMOS NUESTRA CLASE

    //CREAMOS NUESTRO METODO PRINCIPAL
    public static void main(String[] args){
        //CREAMOS NUESTRO OBJETO "SCAN" PARA UTILIZAR LA LIBRERIA "SCANNER"
        Scanner scan = new Scanner(System.in);
        //CREAMOS NUESTRAS VARIABLES PARA GUARDAR LOS DATOS INGRESADOS POR EL USUARIO
        String usuario, contraseña;
        int b;
        boolean a;

        //CREAMOS EL CICLO "DO WHILE" POR SI EL USUARIO O CONTRASEÑA SON INCORRECTOS LOS VUELVA A PEDIR
        do{
        //PEDIMOS Y GUARDAMOS LOS DATOS INGRESADOS POR EL USUARIO
            System.out.print("\nUSUARIO: ");
            usuario = scan.nextLine();
            System.out.print("\nCONTRASEÑA: ");
            contraseña = scan.nextLine();

            //HACEMOS NUESTRO METODO CONTRUCTOR "LOGIN"
            Login log = new Login();

            //COMPARAMOS LOS DATOS INGRESADOS POR EL USUARIO CON LOS GUARDADOS EN EL METODO CONTRUCTOR "LOGIN"
            if (usuario.equals(log.getUSUARIO()) && contraseña.equals(log.getCONTRASEÑA())){
                log.login();//MANDAMOS A LLAMAR LA CLASE QUE NOS DE ACCESO
            }else{//NOTIFICAMOS QUE EL "USUARIO" O "CONTRSEÑA" SON INCORRETOS
                System.out.println("\n¡USUARIO O CONTRASEÑA INCORRECTOS!");
            }
        /*VALIDAMOS LOS DATOS INGRESADOS Y SI SON INCORRECTOS LOS VOLVMEOS A PEDIR
         Y SÍ SI SON CORRECTOS DAMOS ACCESO */
        a = (usuario.equals(log.getUSUARIO()) && contraseña.equals(log.getCONTRASEÑA()));
        }while(a != true);

        //CREAMOS UN MENÚ PARA DAR MULTIPLES OBCIONES EN NUESTRO PROYECTO
        System.out.println("\n-------------MENÚ-------------");
        //LO HACEMOS CON OTRO "DO WHILE" PARA QUE SEA REPETITIVO
        do{        
            try{

                System.out.println("\nINGRESE LO QUE DESEE HACER\n ");
                System.out.println("1.- CREAR");
                System.out.println("2.- LEER");
                System.out.println("3.- ACTUALIZAR");
                System.out.println("4.- ELIMINAR");
                System.out.println("0.- SALIR");
                b = scan.nextInt();
            //UTILIZAMOS EL METODO "SWITCH" PARA PODER HACER SEGÚN SEA EL CASO
            switch (b) {
                case 1:
                    System.out.println("-------------CREANDO PRODUCTOS-------------");
                    String marca, producto, ab;
                    int id, precio;
                    List<Productos> lista = new ArrayList<Productos>();
            
                    do{
                        System.out.print("\nINGRESE EL ID PRODUCTO: ");
                        id = scan.nextInt(); 
                        System.out.print("INGRESE EL NOMBRE DEL PRODUCTO: ");
                        producto = scan.next();
                        System.out.print("INGRESE LA MARCA: ");
                        marca = scan.next();
                        System.out.print("INGRESE UN PRECIO: $");
                        precio = scan.nextInt();
                        lista.add(new Productos(id, marca, precio, producto));
                        System.out.println("\n¿DESEAS AGRETAR OTRO PRODUCTO?\n");
                        ab = scan.next();
                        while(!(ab.equals("si") || ab.equals("no"))){
                            System.out.println("\n¿DESEAS GREGAR OTRO PRODUCTO?\n");
                            ab = scan.next();
                        }
                    }while(ab.equals("si"));

                    for(Productos pro : lista){
                        System.out.println("\n");
                        System.out.println("ID DEL PRODUCTO: " + pro.getId() + ", NOMBRE DEL PRODUCTO: " + pro.getProducto() + ", MARCA: " + pro.getMarca() + ", PRECIO: $" + pro.getPrecio());
                    }
                break;
                case 2:
                    System.out.println("-----------CONSULTANDO PRODUCTO------------");
                break;
                case 3:
                    System.out.println("-----------ACTUALIZANDO PRODUCTO-----------");
                break;
                case 4:
                    System.out.println("ELIMINANDO PRODUCTO");
                default:
                    break;
            }
        //VALIDAMOS PARA QUE SEA REPETITIVO
            }catch(Exception e){
            boolean n = true;
            System.out.println("DATOS INVALIDOS");
            System.out.println("INGRESA UN NÚMERO: ");
            b = scan.nextInt();
        }while(b > 0);
        }
    }
}