
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class MenuComIf {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros:");
        int valor1 = leitor.nextInt();
        leitor.nextLine();
        int valor2 = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite uma das alternativas: A - Multiplicar");
        System.out.print( "B - Somar ");
        System.out.print( "C - Subtrair ");
        System.out.println( "D - Dividir");
        char opcao = leitor.nextLine().charAt(0);
        if (opcao == 'A'){
            System.out.println("O resultado é "+(valor1*valor2));   
        }else if (opcao == 'B'){
            System.out.println("O resultado é "+(valor1+valor2));
    }else if(opcao == 'C'){
        System.out.println("O resultado é "+(valor1-valor2));
    }else if(opcao == 'D'){
        System.out.println("O resultado é "+ (valor1/valor2));
    }else {
        System.out.println("Opção inválida!");
    }
    }
    
}
