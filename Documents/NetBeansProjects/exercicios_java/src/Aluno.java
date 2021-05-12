
/**
 *
 * @author Isadora Xavier
 */
import java.util.Scanner;
public class Aluno {
    public static void main (String[]args){
        String nomeAluno, disciplina;
        Double nota1, nota2, nota3, nota4, media;
        Scanner leitor = new Scanner (System.in);
        System.out.print("Aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.print("Disciplina: ");
        disciplina = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Olá, "+nomeAluno+".Sua média na disciplina "+ disciplina +", é de "+ media + ".");
        
    }
    
}
