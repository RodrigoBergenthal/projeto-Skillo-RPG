import Classes.*;
import Inimigo.EscolheInimigo;
import Inimigo.TurnoInimigo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int turno = 1;
        int opcao;

        System.out.println("Em uma arena, existem cinco personagens espalhados...\n" +
                "1-Ragnar, o Bárbaro.\n" +
                "2-Merlim, a Maga.\n" +
                "3-Arthar, o Guerreiro.\n" +
                "4-Ankhler, o Ladino.\n" +
                "5-Lilith, a Bruxa.\n" +
                "Sabe-se que:\n" +
                "- Bárbaro: difícil combater à distância, fácil corpo-a-corpo.\n" +
                "- Mago: fácil corpo-a-corpo, difícil prever ágeis.\n" +
                "- Guerreiro: fácil contra quem consegue defender, difícil contra fortões.\n" +
                "- Ladino: fácil à distância, sofre corpo-a-corpo.\n" +
                "- Bruxo: fácil corpo-a-corpo e contra magia mundana, difícil contra ágeis e bem defendidos.\n" +
                "\nSelecione seu personagem:");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1 -> {
                Personagem jogador = new Barbaro();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                do {
                    System.out.println("\nTurno " + turno + ":");
                    System.out.println("1- Ataque Comum");
                    System.out.println("2- Ataque Especial");
                    System.out.println("3- Ver stats do jogador");
                    System.out.println("4- Analisar inimigo");

                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            jogador.atacar(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 2 -> {
                            jogador.ataqueEspecial(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 3 -> jogador.exibirStatus();
                        case 4 -> inimigo.exibirStatus();
                        default -> System.out.println("Comando inválido.");
                    }

                } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

                if (jogador.getVida() <= 0) System.out.println("Você perdeu!");
                else System.out.println("Você venceu!");
            }
            case 2 -> {
                Personagem jogador = new Mago();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                do {
                    System.out.println("\nTurno " + turno + ":");
                    System.out.println("1- Ataque Comum");
                    System.out.println("2- Ataque Especial");
                    System.out.println("3- Ver stats do jogador");
                    System.out.println("4- Analisar inimigo");

                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            jogador.atacar(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 2 -> {
                            jogador.ataqueEspecial(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 3 -> jogador.exibirStatus();
                        case 4 -> inimigo.exibirStatus();
                        default -> System.out.println("Comando inválido.");
                    }

                } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

                if (jogador.getVida() <= 0) System.out.println("Você perdeu!");
                else System.out.println("Você venceu!");
            }
            case 3 -> {
                Personagem jogador = new Guerreiro();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                do {
                    System.out.println("\nTurno " + turno + ":");
                    System.out.println("1- Ataque Comum");
                    System.out.println("2- Ataque Especial");
                    System.out.println("3- Ver stats do jogador");
                    System.out.println("4- Analisar inimigo");

                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            jogador.atacar(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 2 -> {
                            jogador.ataqueEspecial(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 3 -> jogador.exibirStatus();
                        case 4 -> inimigo.exibirStatus();
                        default -> System.out.println("Comando inválido.");
                    }

                } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

                if (jogador.getVida() <= 0) System.out.println("Você perdeu!");
                else System.out.println("Você venceu!");
            }
            case 4 -> {
                Personagem jogador = new Ladino();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                do {
                    System.out.println("\nTurno " + turno + ":");
                    System.out.println("1- Ataque Comum");
                    System.out.println("2- Ataque Especial");
                    System.out.println("3- Ver stats do jogador");
                    System.out.println("4- Analisar inimigo");

                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            jogador.atacar(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 2 -> {
                            jogador.ataqueEspecial(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 3 -> jogador.exibirStatus();
                        case 4 -> inimigo.exibirStatus();
                        default -> System.out.println("Comando inválido.");
                    }

                } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

                if (jogador.getVida() <= 0) System.out.println("Você perdeu!");
                else System.out.println("Você venceu!");
            }
            case 5 -> {
                Personagem jogador = new Bruxo();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                do {
                    System.out.println("\nTurno " + turno + ":");
                    System.out.println("1- Ataque Comum");
                    System.out.println("2- Ataque Especial");
                    System.out.println("3- Ver stats do jogador");
                    System.out.println("4- Analisar inimigo");

                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            jogador.atacar(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 2 -> {
                            jogador.ataqueEspecial(inimigo);
                            System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                            System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                            if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                            turno++;
                        }
                        case 3 -> jogador.exibirStatus();
                        case 4 -> inimigo.exibirStatus();
                        default -> System.out.println("Comando inválido.");
                    }

                } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

                if (jogador.getVida() <= 0) System.out.println("Você perdeu!");
                else System.out.println("Você venceu!");
            }
            }
        }
    }