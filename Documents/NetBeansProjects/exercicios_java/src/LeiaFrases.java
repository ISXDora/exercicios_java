
/**
 *
 * @author Isadora Xavier 
 */
import java.util.Scanner;
public class LeiaFrases {
    public static void main (String[]args){
        String frase1, frase2, frase3;
        Scanner leitor = new Scanner (System.in);
        System.out.print("Digite a primeira frase:");
        frase1 = leitor.nextLine();
        System.out.print("Digite a segunda frase:");
        frase2 = leitor.nextLine();
        System.out.print("Digite a terceira frase:");
        frase3 = leitor.nextLine();
        System.out.println("Imprimindo frases em ordem inversa:");
        System.out.println("--------------------------------------------------");
        System.out.println(frase3);
        System.out.println(frase2);
        System.out.println(frase1);
        System.out.println("--------------------------------------------------");

        
        
        
    }
}
