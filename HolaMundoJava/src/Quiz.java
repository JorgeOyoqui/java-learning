
import java.util.Scanner;

//Mi clase en Java
public class Quiz {

    public static void main(String args[]) {
        System.out.println("Nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Bienvenido " + usuario);
        System.out.println("¿Estas listo? s (si) n (no)");
        String flag = consola.nextLine();
        int count =0;
        int responseInt = 0;
        String responseString = "";
         
        if (flag.equals("s")) {
            System.out.println("Entonces empecemos");            
            System.out.println("En que año naci?");
            responseInt = consola.nextInt();
            
            if (responseInt == 2005){
                count++;                
            }
            
             System.out.println("Mi peluche favorito?");
             consola = new Scanner(System.in);
             responseString = consola.nextLine();
             if (responseString.equals("Pato Pato"))
                count++;
           
             System.out.println("Cual es mi color favorito?");
             responseString = consola.nextLine();
             if(responseString.equals("Azul"))
                 count++;
             
             System.out.println("Como se llama mi mundo imaginario?");
             responseString = consola.nextLine();
             if(responseString.equals("Mundo Magico"))
                 count++;
                 
              System.out.println("count: " + count);
             if (count >= 4){
                 System.out.println("Orales, tu si me conoces!!");
             }
        } else{
            
            
            System.out.println("Ok, luego jugamos");
        }
    }
}