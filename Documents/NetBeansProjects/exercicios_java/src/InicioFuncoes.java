import java.util.Scanner;

public class InicioFuncoes {
    public static void main (String args []){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        double resultado = media(nota1,nota2);
        System.out.println("A média é: "+resultado);   
    }
    public static double media(double nota1, double nota2){
        return (nota1+nota2)/2.0;
    }
    
}
