package Inimigo;

import Classes.Personagem;
import java.util.Random;

public class TurnoInimigo {
    private static final Random random = new Random();

    public static void agir(Personagem inimigo, Personagem jogador) {
        int escolha = random.nextInt(2);
        if (escolha == 0 && inimigo.getEnergia() >= 15) {
            System.out.println(inimigo.getNome() + " usa ataque especial!");
            inimigo.ataqueEspecial(jogador);
        } else {
            System.out.println(inimigo.getNome() + " ataca!");
            inimigo.atacar(jogador);
        }
        System.out.println(jogador.getNome() + ": " + jogador.getVida() + " Vida.");
    }
}