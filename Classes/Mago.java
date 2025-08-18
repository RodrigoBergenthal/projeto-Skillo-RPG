package Classes;

import java.util.Random;

//Boa sorte!
public class Mago extends Personagem {
    private static final Random random = new Random();

    public Mago() {
        super("Merlim", "Maga", "EXPLOSÃO!");
        setVida(60);
        setEnergia(100);
        setDefesa(9);
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

        if (c.equals("ladino") || c.equals("bruxo") || c.equals("bruxa")) {
            rolagem = random.nextInt(15) + 1;
        } else if (c.equals("barbaro") || c.equals("guerreiro")) {
            rolagem = random.nextInt(26) + 1;
        } else {
            rolagem = random.nextInt(20) + 1;
        }

        System.out.println("Dado rolado! Resultado... " + rolagem + "!");
        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(getNome() + " arremessa um míssil mágico contra " + inimigo.getNome()
                    + ", e o perfura com a adaga, causando " + dano + " de dano!");
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
        int dano = 30;
        int custoEnergia = 25;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " aponta o centro e canta seu feitiço contra " + inimigo.getNome()
                    + ", dobrando a própria dobra espacial e temporal e causando uma EXPLOSÃO! " + dano + " de dano!");
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