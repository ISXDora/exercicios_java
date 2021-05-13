/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isado
 */
import java.util.Scanner;
public class ValueNota {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        int nota = leitor.nextInt();
        if(nota>=9){
            System.out.println("Você conseguiu com distinção");
        }else if(nota>=7&&nota<9){
            System.out.println("Você conseguiu!");
        }else if(nota>3&&nota<7){
            System.out.println("Você está quase conseguindo!");
        }else if(nota>0&&nota<3){
            System.out.println("Você precisa melhorar muito!");
    }
    } 
}
