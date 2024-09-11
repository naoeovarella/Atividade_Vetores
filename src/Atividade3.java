public class Atividade3 {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] numeros = {5, 10};

        // Exibe os valores antes da troca
        System.out.println("Antes da troca:");
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);

        // Realiza a troca dos valores
        int temp = numeros[0]; // Armazena o valor de numeros[0] em uma variável temporária
        numeros[0] = numeros[1]; // Atribui o valor de numeros[1] a numeros[0]
        numeros[1] = temp; // Atribui o valor armazenado em temp a numeros[1]

        // Exibe os valores após a troca
        System.out.println("\nDepois da troca:");
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
    }
}

