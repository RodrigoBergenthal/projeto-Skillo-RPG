package Classes;
//Boa sorte!

    public class Guerreiro extends Personagem {
        public Guerreiro(String nome) {
            super(nome, "Guerreiro", "Golpe Poderoso");
        }

        @Override
        public void atacar(Personagem inimigo) {
            int dano = 12;

            // Vantagem do Guerreiro contra Ladino e Bárbaro
            if (inimigo instanceof Ladino || inimigo instanceof Barbaro) {
                dano *= 2;
            }
            inimigo.setVida(inimigo.getVida() - dano);
            System.out.println(getNome() + " ataca " + inimigo.getNome() + " causando " + dano + " de dano!");
        }

        @Override
        public void ataqueEspecial(Personagem inimigo) {
            if (getEnergia() >= 20) {
                int dano = 25;
                setEnergia(getEnergia() - 20);

                // Vantagem mantida
                if (inimigo instanceof Ladino || inimigo instanceof Barbaro) {
                    dano *= 2;
                }
                inimigo.setVida(inimigo.getVida() - dano);
                System.out.println(getNome() + " usa " + getEspecial() + " em " + inimigo.getNome() + " causando " + dano + " de dano!");
            } else {
                System.out.println(getNome() + " não tem energia suficiente!");
            }
        }
    }
