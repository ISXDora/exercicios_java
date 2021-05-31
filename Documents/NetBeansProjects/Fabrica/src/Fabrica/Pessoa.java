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
public class Pessoa {
    
    String nome;
    int idade;
    String sexo;
    Carro carro;
    
 /* Atributos de Pessoa */   
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
/* Comunicação com os objetos da classe Carro */
    
    Carro getCarro(){
        return carro;
    }
    
    void setCarro(Carro carro){
        this.carro= carro;
    }
    
/* Inserindo métodos para interagir com instâncias da classe Carro */
    
    void ligarCarro(){
        carro.ligar();
    }
    
    void desligarCarro(){
        carro.desligar();
      
    }
    void frearCarro(){
        carro.frear();
    }
    
    void acelerarCarro(){
        carro.acelerar();
    }
    
    void setCambioCarro(int marcha){
        carro.setCambio(marcha);
    }
    
}
