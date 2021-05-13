
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ImprimeImpar {
    public static void main(String args[]){
        String impressao = " ";
        Scanner leitor = new Scanner(System.in);
        for(int i = 1; i <10 ; i ++){
            System.out.print("Digite uma sequência de 10 números:");
            int numero = leitor.nextInt();
            if(numero % 2 !=0 ){
                impressao = impressao + numero + " ";
            }
         
        }
         System.out.println("Os números ímpares são: " +impressao);
    }
    
}
