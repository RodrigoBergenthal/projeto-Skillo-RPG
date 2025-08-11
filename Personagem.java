public class Personagem {
    // Atributos do personagem
    String nome;
    String classe;
    int vida;
    int forca;
    int nivel;

    // Construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.vida = 100;
        this.forca = 10;
    }

    // Método para exibir os dados do personagem
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("---------------");
    }

    // Método para atacar outro personagem
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " atacou " + inimigo.nome + " causando " + forca + " de dano!");
        inimigo.vida -= forca;

        if (inimigo.vida <= 0) {
            System.out.println(inimigo.nome + " foi derrotado!");
            inimigo.vida = 0;
        }
    }

    // Método para subir de nível
    public void subirNivel() {
        nivel++;
        vida += 20;
        forca += 5;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }
}
