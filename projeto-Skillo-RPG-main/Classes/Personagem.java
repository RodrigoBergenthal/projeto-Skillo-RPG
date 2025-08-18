package Classes;

public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int energia;
    private String especial;

    public Personagem(String nome, String classe, String especial) {
        this.nome = nome;
        this.classe = classe;
        this.especial = especial;
        this.vida = 100;
        this.energia = 50;
    }

    public String getNome() {
        return nome;
    }
    public String getClasse() {
        return classe;
    }
    public int getVida() {
        return vida;
    }
    public int getEnergia() {
        return energia;
    }
    public String getEspecial() {
        return especial;
    }

    public void setVida(int vida) {
        this.vida = Math.max(vida, 0);
    }
    public void setEnergia(int energia)
    { this.energia = Math.max(energia, 0);
    }

    /*
    Creio que Math pode gerar dúvidas:
É uma proteção para que o valor nunca fique negativo.
Math.max(a, b) Recebe dois números como parâmetro e retorna o maior entre eles.
Por exemplo se vida for maior que 0, retorna vida.
Se vida for menor que 0, retorna 0, simples.
    */

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Especial: " + especial);
        System.out.println("---------------");
    }

    // Metodos q as classes devem sobrescrever, talvez podemos adicionar um "ação" para outros efeitos, fica com vocês!
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.getNome() + ", mas o dano não está definido.");
    }

    public void ataqueEspecial(Personagem inimigo) {
        System.out.println(nome + " tenta usar " + especial + ", mas o efeito não está definido.");
    }
}