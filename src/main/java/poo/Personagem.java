package poo;

public class Personagem {

    String nome;
    int mana = 150;
    int vida = 100;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void atacar(Inimigo inimigo) {
        if (mana >= 10) {
            System.out.println(nome + " atacou");
            inimigo.receberDano(75);
            mana -= 10;
        } else {
            System.out.println("Mana insuficiente");
        }

    }

    public void curar() {
        if (vida < 100) {
            System.out.println(nome + " curou!");
            vida += 10;
            mana -= 5;
        } else {
            System.out.println("Vida máxima atingida");
        }
    }

    public void especial(Inimigo inimigo) {
        if (mana >= 50) {
            System.out.println(nome + " soltou ESPECIAL!");
            inimigo.receberDano(150);
            mana -= 45;
        } else {
            System.out.println("Mana insuficiente para usar especial!");
        }
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida <= 0) {
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void resetarStatus() {
        System.out.println("Vida e mana restaurados!");
        mana += 100;
        vida += 100;
    }

    public void showInfo() {
        System.out.println("Status do " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public String getNome() {
        return nome;
    }
}
