import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        // Declaração do vetor com 3 posições
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário e armazena no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibe os números inseridos
        System.out.println("\nNúmeros inseridos:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Calcula a média dos valores inseridos
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = (double) soma / numeros.length;

        // Exibe a média
        System.out.println("\nA média dos números é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}

