/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Multiplo2 {
    public static void main ( String[]args){
       Scanner leitor = new Scanner(System.in);
       System.out.print("Digite 5 números inteiros:");
       int numero1 = leitor.nextInt();
       int numero2 = leitor.nextInt();
       int numero3 = leitor.nextInt();
       int numero4 = leitor.nextInt();
       int numero5 = leitor.nextInt();
       int soma = numero1 + numero2 + numero3 + numero4 + numero5;
       if (soma % 2 == 0) {
           System.out.println("A soma dos números digitados é multiplo de 2!");
       }
    }
    
}
