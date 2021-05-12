/**
 *
 * @author Isadora Xavier
 */
import java.util.Scanner;
public class Leitor {
    public static void main (String[]args){
        String nome;
        double peso;
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.print("Disite seu peso:");
        peso = leitor.nextDouble();
        System.out.print("Disite sua idade:");
        idade = leitor.nextInt();
        System.out.println("---------------------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
        System.out.println("---------------------------------------------");         
    }
    
}
