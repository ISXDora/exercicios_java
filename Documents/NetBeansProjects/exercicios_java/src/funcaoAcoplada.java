import java.util.Scanner;

public class funcaoAcoplada {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        String saida=resultado(media(nota1,nota2));
        System.out.println(saida);
        
    }
    public static String resultado(double valor){
        if(valor>=7){
            return "Aprovado";
        }
        return "Reprovado";
    }
    public static double media(double nota1,double nota2){
        return(nota1+nota2)/2.0;
    }
}
