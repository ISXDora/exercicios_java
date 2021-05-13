
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Aula06 {
    public static void main(String args[]){
        int[] valores = new int[5];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            valores[i]=leitor.nextInt();
        }
        for(int i = 0;i<5;i++){
            System.out.print(valores[i]+"-");
        }
    }
    
}
