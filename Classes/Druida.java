package Classes;

import java.util.Random;

public class Druida extends Personagem {
    private static final Random random = new Random();

    public Druida() {
        super("Lilith", "Druida", "Árvore Espiritual");
        setVida(100);
        setEnergia(50);
        setDefesa(4);
    }

    private static String norm(String s) {
        if (s == null) return "";
        return java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFD)
                .trim()
                .toLowerCase();
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 10;
        String c = norm(inimigo.getClasse());

        int rolagem = random.nextInt(10) + 1;

        System.out.println("Dado rolado! Resultado... " + rolagem + "! ");

        if (c.equals("barbaro") || c.equals("ladino")) {
            dano = (int) (dano + (dano * 0.2));

            if (rolagem > 8) {
                System.out.print(" Crítico!\n");
                dano += (int) ((dano * getCritico()));
            }
        }

        else {
            if (rolagem > 8) {
                System.out.print(" Crítico!\n");
                dano += (int) ((dano * getCritico()));
            }
        }

        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(getNome() + " dá uma chicotada contra " + inimigo.getNome()
                    + ", causando " + dano + " de dano!");
            inimigo.setVida(inimigo.getVida() - dano);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        }

        else {
            System.out.println(getNome() + " tentou acertar o inimigo, mas errou!");
        }
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        int dano = 20;
        int custoEnergia = 15;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " vira lobisomem e fatia " + inimigo.getNome()
                    + " com suas garras, causando " + dano + " de dano!");
            inimigo.setVida(inimigo.getVida() - dano);
            setEnergia(getEnergia() - custoEnergia);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " não tem energia suficiente para o golpe especial!");
        }
    }
}