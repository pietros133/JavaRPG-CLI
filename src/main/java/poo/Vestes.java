/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author pietro-miranda
 */
public class Vestes {
    String nome;
    int durabilidade;
    double percentualDano;

    public Vestes(String nome, int durabilidade, double percentualDano) {
        this.nome = nome;
        this.durabilidade = durabilidade;
        this.percentualDano = percentualDano;
    }

    public String getNome() {
        return nome;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public double getPercentualDano() {
        return percentualDano;
    }
    
    
}
