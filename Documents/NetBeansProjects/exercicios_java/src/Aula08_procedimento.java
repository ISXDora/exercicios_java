import java.util.Scanner;

public class Aula08_procedimento {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        String saida = resultado(media(nota1,nota2));
        saidaRefinada(nota1,nota2,saida);
    }
    public static void saidaRefinada(double n1, double n2, String s){
        System.out.println("O aluno obteve a média "+media(n1,n2)+"e sua situação é: "+s);
    }
    public static String resultado(double valor){
        if(valor>=7){
            return "Aprovado.";
        }
        return "Reprovado.";
    }
    public static double media(double nota1, double nota2){
        return(nota1+nota2)/2.0;
    }
    
        
}
