package Classes;

import java.util.Random;

//Boa sorte!
public class Guerreiro extends Personagem {
    private static final Random random = new Random();

    public Guerreiro() {
        super("Arthar", "Guerreiro", "Corte Voador");
        setVida(100);
        setEnergia(30);
        setDefesa(14);
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
        int rolagem;

        if (c.equals("mago") || c.equals("barbaro")) {
            rolagem = random.nextInt(15) + 1;
        } else if (c.equals("ladino") || c.equals("bruxo") || c.equals("bruxa")) {
            rolagem = random.nextInt(26) + 1;
        } else {
            rolagem = random.nextInt(20) + 1;
        }

        System.out.println("Dado rolado! Resultado... " + rolagem + "!");
        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(getNome() + " realiza uma espadada contra " + inimigo.getNome()
                    + ", e o corta, causando " + dano + " de dano!");
            inimigo.setVida(inimigo.getVida() - dano);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " tentou acertar o inimigo, mas errou!");
        }
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        int dano = 12;
        int custoEnergia = 5;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " brande sua espada, fatiando o ar em direção de " + inimigo.getNome()
                    + ", o fatiando com um corte voador e causando " + dano + " de dano!");
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