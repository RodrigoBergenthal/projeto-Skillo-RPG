package Classes;


public class Barbaro extends Personagem {
    public Barbaro(String nome) {
        super(nome, "Bárbaro", "Fúria");
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 18;

        if (inimigo instanceof Mago || inimigo instanceof Ladino) {
            dano *= 2;
        }
        inimigo.setVida(inimigo.getVida() - dano);
        System.out.println(getNome() + " golpeia " + inimigo.getNome() + " causando " + dano + " de dano!");
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        if (getEnergia() >= 20) {
            int dano = 35;
            setEnergia(getEnergia() - 20);

            if (inimigo instanceof Mago || inimigo instanceof Ladino) {
                dano *= 2;
            }
            inimigo.setVida(inimigo.getVida() - dano);
            System.out.println(getNome() + " entra em " + getEspecial() + " e acerta " + inimigo.getNome() + " causando " + dano + " de dano!");
        } else {
            System.out.println(getNome() + " não tem energia suficiente!");
        }
    }
}
