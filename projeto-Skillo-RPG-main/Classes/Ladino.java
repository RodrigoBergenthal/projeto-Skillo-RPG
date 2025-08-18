package Classes;

public class Ladino extends Personagem {
    public Ladino(String nome) {
        super(nome, "Ladino", "Ataque Furtivo");
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 14;

        if (inimigo instanceof Mago || inimigo instanceof Clerigo) {
            dano *= 2;
        }
        inimigo.setVida(inimigo.getVida() - dano);
        System.out.println(getNome() + " ataca furtivamente " + inimigo.getNome() + " causando " + dano + " de dano!");
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        if (getEnergia() >= 20) {
            int dano = 28;
            setEnergia(getEnergia() - 20);

            if (inimigo instanceof Mago || inimigo instanceof Clerigo) {
                dano *= 2;
            }
            inimigo.setVida(inimigo.getVida() - dano);
            System.out.println(getNome() + " realiza " + getEspecial() + " em " + inimigo.getNome() + " causando " + dano + " de dano!");
        } else {
            System.out.println(getNome() + " não tem energia suficiente!");
        }
    }
}
