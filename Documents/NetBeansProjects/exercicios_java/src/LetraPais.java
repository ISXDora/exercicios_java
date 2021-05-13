
/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class LetraPais {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma letra maiúscula");
        char inicial = leitor.nextLine().charAt(0);
        switch(inicial){
            case 'A':
                System.out.println("Alemanha");
              break;
            case 'B':
                System.out.println("Bulgaria");
              break;
            case 'C':
                System.out.println("Cuba");
              break;
            case 'D':
                System.out.println("Dinamarca");
              break;
            case 'E':
                System.out.println("Espanha");
              break;
            case 'F':
                System.out.println("França");
              break;
            case 'G':
                System.out.println("Germania");
              break;
            case 'H':
                System.out.println("Holanda");
              break;
            case 'I':
                System.out.println("Inglaterra");
              break;
            case 'J':
                System.out.println("Jordania");
              break;
            case 'L':
                System.out.println("Lituania");
              break;
            case 'M':
                System.out.println("Miami");
              break;
            case 'N':
                System.out.println("Noruega");
              break;
            case 'O':
                System.out.println("Oman");
              break;
            case 'P':
                System.out.println("Paquistão");
              break;
            case 'Q':
                System.out.println("Quênia");
              break;
            case 'R':
                System.out.println("Reino Unido");
              break;
            case 'S':
                System.out.println("Senegal");
              break;
            case 'T':
                System.out.println("Turquia");
              break;
            case 'U':
                System.out.println("Uruguai");
              break;
            case 'V':
                System.out.println("Venezuela");
              break;
            case 'Z':
                System.out.println("Zâmbia");
              break;
            default:
                System.out.println("Páis ainda não cadastrado com esta letra.");
              
                          
        }
    }
    
}
