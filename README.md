
# 🛡️ Projeto Skillo RPG

Bem-vindo ao **Skillo RPG**, um projeto colaborativo desenvolvido para treinar os conceitos de **Orientação a Objetos em Java**. Aqui, criamos personagens, batalhamos, evoluímos e exploramos possibilidades de um sistema de RPG simples — com muito espaço para expansão!

## 🎯 Objetivo

Este projeto tem como foco:

- Praticar os fundamentos de **POO (Programação Orientada a Objetos)**.
- Trabalhar com **classes, objetos, atributos, métodos e construtores**.
- Estimular a criatividade com ideias de expansão como inventário, habilidades e sistema de combate.

## 📦 Estrutura Inicial

```java
public class Classes.Personagem {
    String nome;
    String classe;
    int vida;
    int forca;
    int nivel;

    public Classes.Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.vida = 100;
        this.forca = 10;
    }

    public void exibirStatus() { ...}

    public void atacar(Classes.Personagem inimigo) { ...}

    public void subirNivel() { ...}
}
```

```java
import Classes.Personagem;

public class MainPerso {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Arthas", "Classes.Guerreiro");
        Personagem mago = new Personagem("Merlin", "Classes.Mago");

        guerreiro.exibirStatus();
        mago.exibirStatus();

        guerreiro.atacar(mago);
        mago.exibirStatus();

        mago.subirNivel();
        mago.exibirStatus();
    }
}
```

## ✅ Funcionalidades Atuais

- Criação de personagens com nome e classe.
- Exibição de status (vida, força, nível).
- Sistema de ataque entre personagens.
- Evolução de nível com aumento de atributos.

## 🚀 Possibilidades de Expansão

| Funcionalidade                  | Como implementar? |
|--------------------------------|--------------------|
| 🧠 Habilidades por classe       | Criar métodos específicos para cada tipo de personagem |
| 🎒 Inventário de itens         | Usar `ArrayList<Item>` e criar classe `Item` |
| 📈 Sistema de experiência      | Adicionar atributo `xp` e lógica de evolução |
| 💾 Salvamento em arquivo       | Usar `FileWriter` e `Scanner` para persistência |
| 🧟 Inimigos com IA simples     | Criar classe `Inimigo` com comportamento automático |
| 🗺️ Sistema de mapa textual     | Criar menus e opções de exploração via terminal |
| 🕹️ Batalha por turnos         | Implementar loop de combate com escolhas |
| 👥 Múltiplos personagens       | Usar `ArrayList<Classes.Personagem>` para formar grupos |


## 📚 Aprendizados

Este projeto é ideal para entender:

- Encapsulamento e reutilização de código.
- Interação entre objetos.
- Evolução de sistemas orientados a objetos.

---
