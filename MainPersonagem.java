public class MainPersonagem.java {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Arthas", "Guerreiro");
        Personagem mago = new Personagem("Merlin", "Mago");

        guerreiro.exibirStatus();
        mago.exibirStatus();

        // Guerreiro ataca o mago
        guerreiro.atacar(mago);

        // Exibir status após ataque
        mago.exibirStatus();

        // Subir de nível
        mago.subirNivel();
        mago.exibirStatus();
    }
}
/*
✅ O que esse código faz?
Cria personagens com nome e classe.

Exibe o status dos personagens.

Permite que um personagem ataque outro.

Permite subir de nível, aumentando vida e força.

🔁 O que você pode adicionar depois?
Sistema de habilidades específicas por classe.

Inventário (lista de itens).

Sistema de experiência e pontos para evoluir.

Interface gráfica simples com Swing ou JavaFX.

Salvamento de personagens em arquivo (usando FileWriter/Scanner).

Se quiser, posso te ajudar a expandir isso para um sistema mais completo. Deseja adicionar mais alguma coisa como inventário, habilidades ou criação interativa via terminal?

Outras ideias:
Funcionalidade	Como implementar?
🧟‍♂️ Inimigos com IA simples	Criar classe Inimigo com comportamento de ataque automático
🏹 Armas e equipamentos	Criar classe Equipamento, aplicar bônus ao personagem
🗺️ Sistema de mapa/texto	Criar um menu com opções de explorar ou lutar
🕹️ Batalha por turnos	Criar um loop com escolhas de ataque ou fuga
👥 Múltiplos personagens	Usar uma ArrayList<Personagem> para criar um grupo
    */
