
public class Aula07 {
    public static void main (String args[]){
        String arquivo = "musica.mp3";
        if(arquivo.substring(6).equalsIgnoreCase(".mp3")){
            System.out.println("Arquivo de música");
        }else{
            System.out.println("Arquivo descnhecido");
        }
    }
    
}
