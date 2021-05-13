/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ProgramaTeste {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int valor = 0;
        int i=0;
        do{
            System.out.println("Digite um número:");
            int var = leitor.nextInt();
            if(var>valor){
                valor=var;
            }
        }while(i<10);
        System.out.println("O maior número digitado é:"+valor);
    }
    
}
