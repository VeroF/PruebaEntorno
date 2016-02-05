import java.util.Scanner; 
public class Test {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Papi, ¿me compras una moto?");
        String r= entrada.nextLine();
        String respuesta = r.toLowerCase();
        
        while( respuesta.equalsIgnoreCase("no")){
            System.out.println("Anda papi...");
            respuesta= entrada.nextLine().toLowerCase();
        }
        System.out.println("¡Gracias!");
    }
    
}
