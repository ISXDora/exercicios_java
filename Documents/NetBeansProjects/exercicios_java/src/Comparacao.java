
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Comparacao {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();
        leitor.nextLine();
        if(numero1 == numero2){
            System.out.println("Os números são iguais");
        }else if(numero1>numero2) {
            System.out.println("O número "+numero1+", é o número maior.");
            }else if(numero2>numero1){
                System.out.println("O número"+numero2+",é o número maior.");
            }      
    }
    
}
