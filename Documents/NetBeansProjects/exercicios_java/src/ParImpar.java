
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ParImpar{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número digitado é par!");
        }else {
            System.out.println("O número digitado é ímpar!");
        }
    }
}
