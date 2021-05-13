/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Maior10DoWhile {
    public static void main(String args[]){
        int numero;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.print("Por favor, digite um número:");
            numero = leitor.nextInt();
            
        }while(numero<10);
        System.out.println("Finalmente você digitou um número maior que 10. Obrigada :p");
}
}