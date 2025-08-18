package Classes;

public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int energia;
    private int defesa;
    private String especial;


    public Personagem(String nome, String classe, String especial) {
        this.nome = nome;
        this.classe = classe;
        this.especial = especial;
        this.vida = 100;
        this.energia = 50;
        this.defesa = 10;
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
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getDefesa() {
        return defesa;
    }


    public void setVida(int vida) {
        this.vida = Math.max(vida, 0);
    }
    public void setEnergia(int energia)
    {
        this.energia = Math.max(energia, 0);
    }

    public void exibirStatus() {
        System.out.println("---------------");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Especial: " + especial);
        System.out.println("---------------");
    }

    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.getNome() + ", mas o dano não está definido.");
    }

    public void ataqueEspecial(Personagem inimigo) {
        System.out.println(nome + " tenta usar " + especial + ", mas o efeito não está definido.");
    }

    public void setNome(String Ser) {
        Ser = nome;
    }
}