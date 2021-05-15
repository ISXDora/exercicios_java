/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class ProgramaNotasArray {
    public static void main(String args []){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 1; i < quantidade +1; i++){
            System.out.println("Digite a nota de número "+i);
            notas[i] = leitor.nextDouble();
        }
        for(int i = 1; i < quantidade + 1; i++){
            System.out.println("Nota "+(notas[i])+" na posição "+ i +" do array.");
        }
    }
    
}
