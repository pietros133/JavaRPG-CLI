package com.mycompany.jogopoo;

import poo.Heroi;
import poo.Goblin;
import poo.Chefe;
import poo.Inimigo;
import poo.Esqueleto;
import java.util.Scanner;
import poo.Utils;

public class JogoPoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        ⚔️  RPG TERMINAL ⚔️");
        System.out.println("=================================");

        System.out.print("\nDigite o nome do seu herói: ");
        String nome = sc.nextLine();

        Heroi meuHeroi = new Heroi(nome);
        Inimigo inimigo = new Goblin();

        int fase = 1;

        System.out.println("\n🔥 A aventura começa!");
        Utils.delay(500);
        System.out.println("Um Goblin apareceu!");
        Utils.delay(500);
        while (true) {

            System.out.println("\n---------------------------------");
            System.out.println("             MENU");
            System.out.println("---------------------------------");
            System.out.println("1 ⚔️  Atacar");
            System.out.println("2 ❤️  Curar");
            System.out.println("3 📊 Ver Status");
            System.out.println("4 💥 Ataque Especial");
            System.out.println("5 🚪 Abandonar luta");
            System.out.println("---------------------------------");
            System.out.print("Escolha uma opção: ");

            int option = sc.nextInt();

            System.out.println();

            switch (option) {

                case 1:
                    meuHeroi.atacar(inimigo);

                    if (inimigo.getVida() > 0) {
                        Utils.delay(1500);
                        inimigo.atacar(meuHeroi);
                    }
                    break;

                case 2:
                    System.out.println("❤️  Você usou uma poção!");
                    meuHeroi.curar();
                    break;

                case 3:
                    System.out.println("\n📊 STATUS DO COMBATE");
                    System.out.println("---------------------------------");
                    meuHeroi.showInfo();
                    inimigo.mostrarVida();
                    break;

                case 4:
                    System.out.println("💥 ATAQUE ESPECIAL!");
                    meuHeroi.especial(inimigo);

                    if (inimigo.getVida() > 0) {
                        Utils.delay(1500);
                        inimigo.atacar(meuHeroi);
                    }
                    break;

                case 5:
                    System.out.println("🚪 Você abandonou a luta...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Opção inválida!");
            }

            if (meuHeroi.getVida() <= 0) {
                System.out.println("\n💀 Você foi derrotado...");
                System.out.println("Game Over!");
                sc.close();
                return;
            }

            if (inimigo.getVida() <= 0) {

                System.out.println("\n🏆 Inimigo derrotado!");

                fase++;

                meuHeroi.resetarStatus();

                if (fase == 2) {

                    Utils.delay(1500);
                    System.out.println("\n💀 Espere...");
                    Utils.delay(1500);

                    System.out.println("Um ESQUELETO apareceu!!!");

                    inimigo = new Esqueleto();

                } else if (fase == 3) {

                    Utils.delay(1500);
                    System.out.println("\n🌩️ Um barulho estrondoso...");
                    Utils.delay(1500);

                    System.out.println("👑 Não pode ser... é o REI GOBLIN!");

                    inimigo = new Chefe();

                } else {

                    System.out.println("\n🎉 PARABÉNS!");
                    System.out.println("Você venceu o jogo!");
                    break;
                }
            }
        }

        sc.close();
    }
}