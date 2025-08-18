package Inimigo;

import Classes.Barbaro;
import Classes.Bruxo;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Ladino;
import Classes.Personagem;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class EscolheInimigo {
    private static Random random = new Random();

    public static Personagem escolheInimigo() {
        int numero = random.nextInt(5) + 1;
        Personagem inimigo;

        switch (numero) {
            case 1 -> {
                inimigo = new Barbaro();
            }
            case 2 -> {
                inimigo = new Bruxo();
            }
            case 3 -> {
                inimigo = new Ladino();
            }
            case 4 -> {
                inimigo = new Guerreiro();
            }
            case 5 -> {
                inimigo = new Mago();
            }
            default -> {
                inimigo = new Ladino();
                for (int i = 0; i < 5; i++) {
                    System.out.println("\n\nUm erro aconteceu!\n\n");
                }
            }
        }

        return inimigo;
    }
}