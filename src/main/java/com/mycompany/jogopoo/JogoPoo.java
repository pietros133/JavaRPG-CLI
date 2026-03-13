package com.mycompany.jogopoo;

import poo.Heroi;
import poo.Goblin;
import poo.Chefe;
import poo.Inimigo;
import poo.Esqueleto;
import java.util.Scanner;

public class JogoPoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do seu herói:");
        String nome = sc.nextLine();

        Heroi meuHeroi = new Heroi(nome);
        Inimigo inimigo = new Goblin();

        int fase = 1;

        while (true) {

            System.out.println("\nEscolha:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Curar");
            System.out.println("3 - Ver status");
            System.out.println("4 - Especial");
            System.out.println("5 - Abandonar luta");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    meuHeroi.atacar(inimigo);
                    inimigo.atacar(meuHeroi);
                    break;

                case 2:
                    meuHeroi.curar();
                    break;

                case 3:
                    meuHeroi.showInfo();
                    inimigo.mostrarVida();
                    break;

                case 4:
                    meuHeroi.especial(inimigo);
                    inimigo.atacar(meuHeroi);
                    break;

                case 5:
                    System.out.println("Abandonando luta!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida");
            }

            if (inimigo.getVida() <= 0) {

                fase++;

                meuHeroi.resetarStatus();

                if (fase == 2) {
                    System.out.println("Espere... Um Esqueleto apareceu!!!");
                    inimigo = new Esqueleto();

                } else if (fase == 3) {
                    System.out.println("Um barulho estrondoso...");
                    System.out.println("Não pode ser... é o Rei Goblin!");
                    inimigo = new Chefe();

                } else {
                    System.out.println("Parabéns! Você venceu o jogo!");
                    break;
                }
            }
        }
    }
}