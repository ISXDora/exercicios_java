
package Celulares;

/**
 *
 * @author isado
 */
public class Tijolinho {
    protected String modelo;
    
    
    public String getModelo(){
    return modelo;
}
    public void setModelo(String modelo){
        this.modelo = modelo;
    
}
    
    public void ligar(){
      System.out.println("Ligando para...");
    }
    public void atender(){
        System.out.println("Atendendo ligação de ...");
    }
}