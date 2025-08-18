import Classes.*;

public class MainPersonagem {
        public static void main(String[] args) {
            Guerreiro thorin = new Guerreiro("Thorin");
            Mago merlin = new Mago("Merlin");
            Barbaro athens = new Barbaro("Athens");
            Clerigo alaric = new Clerigo("Alaric");
            Ladino kavish= new Ladino("Kavish");

            System.out.println("Status inicial");
            thorin.exibirStatus();
            merlin.exibirStatus();
            athens.exibirStatus();
            alaric.exibirStatus();
            kavish.exibirStatus();

            System.out.println("\nBatalha");
            thorin.atacar(kavish);   // Guerreiro tem vantagem contra o Ladino
            merlin.ataqueEspecial(thorin); // Mago tem vantagem contra o Guerreiro
            athens.atacar(merlin);   // Bárbaro tem vantagem contra o Mago
            kavish.ataqueEspecial(alaric); // Ladino tem vantagem contra o Clérigo
            alaric.ataqueEspecial(athens); // Clérigo tem vantagem contra o Bárbaro
        }
    }

