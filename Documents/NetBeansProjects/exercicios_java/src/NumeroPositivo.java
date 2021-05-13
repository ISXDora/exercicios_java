
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class NumeroPositivo {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = leitor.nextInt();
        if(numero>0){
            System.out.println((numero*2));
        }else{
            System.out.println((numero*numero));
        }
    }
    
}
