/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Maior10 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int numero = leitor.nextInt();
        if (numero>10){
            System.out.println("O número digitado é maior do que 10.");
        }
        
    }
    
}
