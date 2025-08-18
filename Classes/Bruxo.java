package Classes;

import java.util.Random;

public class Bruxo extends Personagem {
    private static final Random random = new Random();

    public Bruxo() {
        super("Lilith", "Bruxa", "Necrosar");
        setVida(100);
        setEnergia(50);
        setDefesa(12);
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

        if (c.equals("ladino") || c.equals("guerreiro")) {
            rolagem = random.nextInt(15) + 1;
        } else if (c.equals("barbaro") || c.equals("mago")) {
            rolagem = random.nextInt(26) + 1;
        } else {
            rolagem = random.nextInt(20) + 1;
        }

        System.out.println("Dado rolado! Resultado... " + rolagem + "!");
        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(getNome() + " lança um feitiço em " + inimigo.getNome()
                    + ", causando " + dano + " de dano!");
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
        int dano = 20;
        int custoEnergia = 15;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " aponta o dedo para " + inimigo.getNome()
                    + " e o corpo dele definha, causando " + dano + " de dano!");
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