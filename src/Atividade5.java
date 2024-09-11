import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        // Declaração do vetor com 3 posições
        String[] nomes = new String[3];
        Scanner scanner = new Scanner(System.in);

        // Solicita os nomes ao usuário e armazena no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Exibe os nomes inseridos
        System.out.println("\nNomes inseridos:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}

