
package Celulares;

/**
 *
 * @author isado
 */
public class BlackBerry1 extends Tijolinho {
    protected int tela;
    protected String rede;
    
    public String getRede(){
        return rede;
    }
    public void setRede(String rede){
        this.rede = rede;
    }
    
    
    public int getTela(){
        return tela;
    }
    public void setTela(int tela){
        this.tela = tela;
    }
    
    public void radio(){
        System.out.println("Ouvindo rádio...");
    }
    public void mp3(){
        System.out.println("Ouvindo álbum de músicas...");
    }
   
    
    
}
