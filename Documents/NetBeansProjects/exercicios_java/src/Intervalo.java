
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Intervalo {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor, digite um número:");
        double valor = leitor.nextDouble();
        if(valor >= 10 && valor <= 20){
            System.out.println("O valor digitado está entre 10 e 20.");
        }else{
            System.out.println("O valor está fora do intervalo.");
        }
    }
    
}
