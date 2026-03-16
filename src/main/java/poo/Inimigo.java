package poo;

public class Inimigo {

    String nome;
    int vida;
    int dano;

    public Inimigo(String nome, int dano, int chefeVida) {
        this.nome = nome;
        this.dano = dano;
        this.vida = chefeVida;
    }

    public void atacar(Personagem personagem) {
        if (personagem.vida > 0) {
            System.out.println(nome + " atacou!");
            personagem.receberDano(dano);
        } else {
            System.out.println(personagem.nome + " foi derrotado!");
        }
    }

    public void mostrarVida() {
        System.out.println("Vida do " + nome + ": " + vida);
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida <= 0) {
            System.out.println(nome + " foi derrotado!");
        }
    }

    public int getVida() {
        return vida;
    }
}