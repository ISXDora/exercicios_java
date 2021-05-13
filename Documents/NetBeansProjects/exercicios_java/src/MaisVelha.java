
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class MaisVelha {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nomeA = leitor.nextLine();
        System.out.println("Digite o ano do seu nascimento:");
        int anoA = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite o nome da próxima pessoa:");
        String nomeB = leitor.nextLine();
        System.out.println("Agora digite o ano de nascimento:");
        int anoB = leitor.nextInt();
        leitor.nextLine();
        
        
        if(anoA < anoB){
            System.out.println(nomeA + " é a pessoa mais velha.");
        } else {
            System.out.println(nomeB + " é a pessoa mais velha.");
    }
    
}
}
