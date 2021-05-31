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
public class teste {
    public static void main (String[]args){
       System.out.println("Meu primeiro programa java");
       
       Carro meuCarro = new Carro();
       Carro outroCarro = new Carro("passeio", "azul", "KLH 2345", 4);
       meuCarro.setCor("preto");
       meuCarro.setNumPortas(4);
       meuCarro.setPlaca("MHK 1234");
       meuCarro.setTipo("esportivo");
       
       Pessoa pessoa = new Pessoa();
       pessoa.setNome("Camila");
       pessoa.setIdade(27);
       meuCarro.setDono(pessoa);
       
       
       System.out.println("Cor: "+ meuCarro.getCor());
       System.out.println("Número de portas: "+meuCarro.getNumPortas());
       System.out.println("Placa: "+meuCarro.getPlaca());
       System.out.println("Tipo: "+meuCarro.getTipo());
       System.out.println("Pertence à: "+meuCarro.getDono().getNome());
       
       System.out.println(outroCarro.cor);
       
    }
    
}
