import java.util.Scanner;
public class confereSenha {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String nome1 = leitor.next();
        System.out.println("Digite novamente a senha:");
        String nome2 = leitor.next();
        if(nome1.equals(nome2)){
            System.out.println("Senhas atualizadas com sucesso");
        }else{
            System.out.println("Tente novamente");
        }
    }
    
}
