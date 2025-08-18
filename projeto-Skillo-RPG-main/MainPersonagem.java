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
            thorin.atacar(kavish); 
            merlin.ataqueEspecial(thorin);
            athens.atacar(merlin);
            kavish.ataqueEspecial(alaric);
            alaric.ataqueEspecial(athens);
        }
    }

