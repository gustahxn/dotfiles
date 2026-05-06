public class PrimitivosExplosivos {
    public static void main(String[] args) {
        // Exemplo de imprecisão com ponto flutuante
        double valor1 = 0.1;
        double valor2 = 0.2;
        System.out.println("0.1 + 0.2 = " + (valor1 + valor2)); 
        // Resultado: 0.30000000000000004 (A exatidão absoluta não existe aqui)

        // Exemplo de Overflow (Estouro de capacidade)
        int limite = Integer.MAX_VALUE; // 2.147.483.647
        System.out.println("Limite do int: " + limite);
        System.out.println("Limite + 1: " + (limite + 1)); 
        // Resultado: -2147483648 (O valor "vira" para o negativo, como o caso do Ariane 5)
    }
}