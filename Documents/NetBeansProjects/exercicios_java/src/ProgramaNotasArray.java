/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ProgramaNotasArray {
    public static void main(String args []){
        Scanner leitor = new Scanner(System.in);
        System.err.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite a nota de número "+i);
            notas[i] = leitor.nextDouble();
        }
        for(int i = 0; i < quantidade; i++){
            System.out.println((notas[i]));
        }
    }
    
}
