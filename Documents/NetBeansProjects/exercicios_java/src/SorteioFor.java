/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class SorteioFor {
    public static void main(String args []){
        long numero = Math.round(Math.random()*10);
        long chute;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        chute = leitor.nextLong();
        for(int i = 1;;i++){
            if(numero!=chute){
                System.out.println("Digite um número entre 1 e 10");
                chute = leitor.nextLong();
            }else{
                System.out.println("Você acertou!");
                break;
                
            }
        }
    }
    
}
