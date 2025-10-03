package Questao03;

public class Filme {

    private String nome;
    private String genero;
    private int ano;
    private int duracao; // em minutos
    private int somaNotas = 0;
    private int qtdAvaliacoes = 0;


    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        System.out.println("------ Detalhes do Filme ------");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("-------------------------------");
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso.");
        } else {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        }
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return (double) somaNotas / qtdAvaliacoes;
    }
}


