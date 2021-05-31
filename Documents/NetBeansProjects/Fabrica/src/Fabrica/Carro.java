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
public class Carro {
    String cor;
    String tipo;
    String placa;
    int numPortas;
    Pessoa dono;
    int cambio;
    
    
    public Carro(String tipo, String cor, String placa, int numPortas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas=numPortas;
    }
    
    public Carro (){
    
    }
    
/* Metodos para alterar o parametro pessoa dentro da classe Carro */
    
    Pessoa getDono(){
        return dono;
    }
    
    void setDono(Pessoa dono){
        this.dono = dono;
    }
    
    
/*Atributos de Carro */
    
    public void setCor (String c){
        cor = c;
    }
    String getCor(){
        return cor;
    }
    
    String getTipo(){
        return tipo;
    }
    void setTipo(String tipo){
        this.tipo = tipo;
    }
    String getPlaca(){
        return placa;
    }
    void setPlaca(String placa){
        this.placa = placa;
    }
    int getNumPortas(){
        return numPortas;
    }
    void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

/* Adicionar os métodos ligar(), desligar(), acelerar(), frear() à classe Carro.*/
   
    void ligar(){
        System.out.println("Carro ligado.");
    }
    void desligar(){
        System.out.println("Carro desligado.");
    }
    void acelerar(){
        System.out.println("Carro acelerando.");
    }
    void frear(){
        System.out.println("Carro freando.");
    }
    
/* Cambio */
    
    public int getCambio(){
        return this.cambio;
    }
    
    public void setCambio(int marcha){
        this.cambio = marcha;
    }
    
}

