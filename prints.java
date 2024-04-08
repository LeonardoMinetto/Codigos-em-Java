import java.util.Random;
import java.util.Scanner;

public class prints {
    
    public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe um numero inteiro: ");
            int i = teclado.nextInt();//lê um número inteiro

            System.out.println("Informe um numero decimal:");
            double d = teclado.nextDouble();//lê um número real

            System.out.println("Informe uma frase: ");
            String s = teclado.nextLine();//lê uma cadeia de caracteres
            s = teclado.nextLine();//lê uma frase

            System.out.println("Inteiro: "+ i +", real: "+ d);
            System.out.println("frase: "+s);
            
            Random x = new Random();
            int aleatorio = x.nextInt(10);
            System.out.println("\nNumero aleatorio gerado: "+aleatorio);

    }
        
}
