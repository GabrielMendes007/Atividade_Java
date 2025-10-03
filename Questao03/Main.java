package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = null;

        int opcao;
        do {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Cadastrar um título");
            System.out.println("2. Exibir detalhes do título");
            System.out.println("3. Avaliar o título");
            System.out.println("4. Exibir média das avaliações");
            System.out.println("5. Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do filme: ");
                    String nome = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();

                    System.out.print("Duração (minutos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine(); // limpa buffer

                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    if (filme != null) {
                        filme.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum filme cadastrado ainda.");
                    }
                    break;

                case 3:
                    if (filme != null) {
                        System.out.print("Digite a nota (0 a 10): ");
                        int nota = scanner.nextInt();
                        scanner.nextLine(); // limpa buffer
                        filme.avaliar(nota);
                    } else {
                        System.out.println("Nenhum filme cadastrado ainda.");
                    }
                    break;

                case 4:
                    if (filme != null) {
                        double media = filme.calcularMediaAvaliacoes();
                        if (media == 0) {
                            System.out.println("Nenhuma avaliação registrada ainda.");
                        } else {
                            System.out.printf("Média das avaliações: %.2f\n", media);
                        }
                    } else {
                        System.out.println("Nenhum filme cadastrado ainda.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

