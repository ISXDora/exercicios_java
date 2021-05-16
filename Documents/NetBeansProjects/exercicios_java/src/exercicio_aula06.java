import java.util.Scanner;
public class exercicio_aula06 {
    public static void main (String args[]){
        Scanner leitor = new Scanner (System.in);
        double [] numeros = new double [2];
        System.out.println("Digite um número:");
        numeros[1]=leitor.nextDouble();
        System.out.println("Digite outro número:");
        numeros[2]=leitor.nextDouble();
        System.out.println("A soma dos números é:"+(numeros[1]+numeros[2]));
    }
    
}
