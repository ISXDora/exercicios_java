/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ProgramaForArray3 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a digitar:");
        int [] valores = new int[leitor.nextInt()];
        System.out.println("Digite agora os valores:");
        for(int i =0;i<valores.length;i++){
            valores[i] = leitor.nextInt();
            
        }
        System.out.print("Valores digitados: ");
        for(int i=0;i<valores.length;i++){
            System.out.print(valores[i]+" - ");
        }
    }
    
}
