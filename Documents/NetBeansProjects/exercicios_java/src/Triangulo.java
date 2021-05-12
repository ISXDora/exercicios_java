/**
 *
 * @author isadora
 */
import java.util.Scanner;
public class Triangulo {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite as medidas de cada lado do triângulo:");
        float a = leitor.nextFloat();
        float b = leitor.nextFloat();
        float c = leitor.nextFloat();
        if ((a<b+c)&&(b<a+c)&&(c<a+b)){
            System.out.println("Os lados formam um triângulo!");
        }
    }
    
}
