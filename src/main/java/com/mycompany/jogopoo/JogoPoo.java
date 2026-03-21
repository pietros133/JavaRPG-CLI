package com.mycompany.jogopoo;

import poo.Heroi;
import poo.Goblin;
import poo.Chefe;
import poo.Inimigo;
import poo.Esqueleto;
import java.util.Scanner;
import javax.swing.JOptionPane;
import poo.Utils;
import poo.Espada;
import poo.Machado;
import poo.Marreta;
import poo.ArmaduraDourada;
import poo.ArmaduraPrata;

public class JogoPoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        ⚔️  RPG TERMINAL ⚔️");
        System.out.println("=================================");

        System.out.print("\nDigite o nome do seu herói: ");
        String nome = sc.nextLine();

        Heroi meuHeroi = new Heroi(nome);

        System.out.println("===============================");
        System.out.println("   ⚔️ SELEÇÃO DE EQUIPAMENTOS ⚔️ ");
        System.out.println("===============================");
        System.out.println("Escolha: 1 - SKULL BREAKER (ESPADA) | 2 - SKY BREAKER (MACHADO) | 3 - GRAVEYARD SIGN (MARRETA)");
        System.out.println("==============================================================================================");

        int optionWeapon = sc.nextInt();

        switch (optionWeapon) {
            case 1:
                JOptionPane.showMessageDialog(null, "⚔️ Arma escolhida: Skull Breaker");
                meuHeroi.equiparArma(new Espada());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "⚔️ Arma escolhida: Sky Breaker");
                meuHeroi.equiparArma(new Machado());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "⚔️ Arma escolhida: Graveyard Sign");
                meuHeroi.equiparArma(new Marreta());
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Opção inválida!");
                break;
        }

        System.out.println("===============================");
        System.out.println("    ⚔ SELEÇÃO DE ARMADURAS ⚔   ");
        System.out.println("=================================================================");
        System.out.println("Escolha: 1 - FALLEN GOLDEN (OURO) | 2 - FALLEN SILVER (PRATA)");
        System.out.println("=================================================================");

        int optionWearing = sc.nextInt();

        switch (optionWearing) {
            case 1:
                JOptionPane.showMessageDialog(null, "🛡️ Armadura escolhida: Fallen Golden");
                meuHeroi.tryNewVeste(new ArmaduraDourada());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "🛡️ Armadura escolhida: Fallen Silver");
                meuHeroi.tryNewVeste(new ArmaduraPrata());
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Opção inválida!");
                break;
        }

        Inimigo inimigo = new Goblin();
        int fase = 1;

        JOptionPane.showMessageDialog(null, "🔥 A aventura começa!");
        Utils.delay(500);
        JOptionPane.showMessageDialog(null, "👾 Um Goblin apareceu!");

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

            switch (option) {

                case 1:
                    JOptionPane.showMessageDialog(null, "⚔️ Você atacou o inimigo!");
                    meuHeroi.atacar(inimigo);

                    if (inimigo.getVida() > 0) {
                        Utils.delay(600);
                        JOptionPane.showMessageDialog(null, "💀 O inimigo contra-atacou!");
                        inimigo.atacar(meuHeroi);
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "❤️ Você usou uma poção!");
                    meuHeroi.curar();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                        "📊 STATUS:\n\n" +
                        "Herói:\nVida: " + meuHeroi.getVida() +
                        "\n\nInimigo:\nVida: " + inimigo.getVida()
                    );
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "💥 ATAQUE ESPECIAL!");
                    meuHeroi.especial(inimigo);

                    if (inimigo.getVida() > 0) {
                        Utils.delay(500);
                        JOptionPane.showMessageDialog(null, "💀 O inimigo atacou!");
                        inimigo.atacar(meuHeroi);
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "🚪 Você abandonou a luta...");
                    sc.close();
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "❌ Opção inválida!");
            }

            if (meuHeroi.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "💀 Você foi derrotado...\nGame Over!");
                sc.close();
                return;
            }

            if (inimigo.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "🏆 Inimigo derrotado!");

                fase++;
                meuHeroi.resetarStatus();
                Utils.delay(500);

                if (fase == 2) {
                    JOptionPane.showMessageDialog(null, "💀 Um Esqueleto apareceu!");
                    inimigo = new Esqueleto();
                } else if (fase == 3) {
                    JOptionPane.showMessageDialog(null, "👑 O REI GOBLIN surgiu!");
                    inimigo = new Chefe();
                } else {
                    JOptionPane.showMessageDialog(null, "🎉 PARABÉNS!\nVocê venceu o jogo!");
                    break;
                }
            }
        }

        sc.close();
    }
}
