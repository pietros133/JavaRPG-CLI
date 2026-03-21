/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author pietro-miranda
 */
public class Equipamento {
    String nome;
    int dano;
    
    public Equipamento(String nome,int dano){
        this.nome = nome;
        this.dano = dano;
    }
    
    public void atacar(Personagem personagem){
        System.out.println(" atacou utilizando " + nome);
        
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }
    
    
}
