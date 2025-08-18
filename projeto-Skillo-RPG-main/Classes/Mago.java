package Classes;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, "Mago", "Bola de Fogo");
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 15;

        if (inimigo instanceof Guerreiro || inimigo instanceof Clerigo) {
            dano *= 2;
        }
        inimigo.setVida(inimigo.getVida() - dano);
        System.out.println(getNome() + " lança magia em " + inimigo.getNome() + " causando " + dano + " de dano!");
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        if (getEnergia() >= 20) {
            int dano = 30;
            setEnergia(getEnergia() - 20);

            if (inimigo instanceof Guerreiro || inimigo instanceof Clerigo) {
                dano *= 2;
            }
            inimigo.setVida(inimigo.getVida() - dano);
            System.out.println(getNome() + " conjura " + getEspecial() + " em " + inimigo.getNome() + " causando " + dano + " de dano!");
        } else {
            System.out.println(getNome() + " não tem energia suficiente!");
        }
    }
}
