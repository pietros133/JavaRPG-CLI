package poo;

public class Personagem {

    String nome;
    int mana = 150;
    int vida = 100;
    Equipamento equipamento;
    Vestes vestes;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void tryNewVeste(Vestes vestes) {
        this.vestes = vestes;
    }

    public void armorBuff() {
        if (vestes != null) {
            System.out.println("Dano %: " + vestes.getPercentualDano());
        }
    }

    public void atacar(Inimigo inimigo){
        if(mana >= 10){
            int danoBase;
           
            if(equipamento != null){
                System.out.println(nome + " atacou com " + equipamento.nome);
                danoBase = equipamento.dano;
            }else{
                System.out.println(nome + " atacou com os punhos!");
                danoBase = 10;
            }
            
            //aplicando debuff da armadura
            if(vestes != null){
                double percentual = vestes.getPercentualDano();
                danoBase += danoBase * percentual;
            }
            
            inimigo.receberDano(danoBase);
            mana -=10;
        }
        else{
            System.out.println("mana insuficiente!!");
        }
    }

    public void curar() {
        if (vida <= 100) {
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
        int vidaMax = 100;
        int manaMax = 150;

        if (vida < vidaMax) {
            vida = vidaMax;
        }
        if (mana < manaMax) {
            mana = manaMax;
        }

        System.out.println("Vida e Mana restaurados!");

    }

    public void showInfo() {
        System.out.println("Status do " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
    }

    public void equiparArma(Equipamento equipamento) {
        this.equipamento = equipamento;
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
