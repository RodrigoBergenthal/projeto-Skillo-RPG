package Classes;

import java.text.DecimalFormat;
import java.util.Random;

//Boa sorte!
public class Ladino extends Personagem {
    private static final Random random = new Random();
    DecimalFormat df = new DecimalFormat("0.000");

    public Ladino() {
        super("Ankhler", "Ladino", "Mil Cortes");
        setVida(100);
        setEnergia(20);
        setDefesa(16);
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

        if (c.equals("barbaro") || c.equals("guerreiro")) {
            rolagem = random.nextInt(15) + 1;
        } else if (c.equals("mago") || c.equals("maga") || c.equals("bruxo") || c.equals("bruxa")) {
            rolagem = random.nextInt(26) + 1;
        } else {
            rolagem = random.nextInt(20) + 1;
        }

        System.out.println("Dado rolado! Resultado... " + rolagem + "!");
        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(getNome() + " chega por trás em " + inimigo.getNome()
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
        double danoMax = 0.05;
        double dano = 0;
        double danoTotal = 0;
        int custoEnergia = 10;
        int i;
        if (getEnergia() >= custoEnergia) {
            System.out.print(getNome() + " se posiciona e realiza mil cortes contra " + inimigo.getNome()
                    + ", fatiando sem parar por...");
            for(i = 1; i < 1000 ; i++) {
                dano = random.nextDouble(danoMax);
                System.out.print(i + "º..." + df.format(dano) + "!   ");
                danoTotal += dano;
            }
            System.out.println("\n" + getNome() + " realizou " + i + " cortes contra " + inimigo.getNome() + ", totalizando... " + (int)(danoTotal) + " de dano!");
                inimigo.setVida((int) (inimigo.getVida() - danoTotal));
                setEnergia(getEnergia() - custoEnergia);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " não tem energia suficiente para o golpe especial!");
        }
    }
}