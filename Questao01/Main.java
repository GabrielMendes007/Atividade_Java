package Questao01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Leitura dos dados do funcionário
                System.out.print("Digite a matrícula do funcionário: ");
                String matricula = scanner.nextLine();

                System.out.print("Digite o nome do funcionário: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o salário bruto do funcionário: ");
                double salarioBruto = scanner.nextDouble();

                // Criando objeto Funcionario
                Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto);

                // Exibindo o contracheque
                funcionario.exibirContracheque();

                scanner.close();
            }
        }











