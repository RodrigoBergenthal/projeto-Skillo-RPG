package Classes;

public class Clerigo extends Personagem {
    public Clerigo(String nome) {
        super(nome, "Clérigo", "Luz Divina");
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 10;

        if (inimigo instanceof Guerreiro || inimigo instanceof Barbaro) {
            dano *= 2;
        }
        inimigo.setVida(inimigo.getVida() - dano);
        System.out.println(getNome() + " golpeia com cajado " + inimigo.getNome() + " causando " + dano + " de dano!");
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        if (getEnergia() >= 20) {
            int dano = 20;
            setEnergia(getEnergia() - 20);

            if (inimigo instanceof Guerreiro || inimigo instanceof Barbaro) {
                dano *= 2;
            }
            inimigo.setVida(inimigo.getVida() - dano);
            System.out.println(getNome() + " invoca " + getEspecial() + " contra " + inimigo.getNome() + " causando " + dano + " de dano!");
        } else {
            System.out.println(getNome() + " não tem energia suficiente!");
        }
    }
}
