/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author isado
 */
public class Main {
    public static void main(String[]args){
        
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("MXH 1234");
        meuCarro.setTipo("esportivo");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Camila");
        pessoa.setIdade(27);
        
        pessoa.setCarro(meuCarro);
        
        pessoa.ligarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(3);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(0);
        pessoa.frearCarro();
        pessoa.desligarCarro();
    }
    
}
