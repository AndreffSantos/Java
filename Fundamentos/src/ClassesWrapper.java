public class ClassesWrapper {
    public static void main(String[] args) {
        Integer valor = 7;
        int novoValor = valor;
        // Nesse exemplo, a conversão entre o tipo primitivo int e o tipo não primitivo (classe wrapper) Integer é feita automaticament
        System.out.println(novoValor);

        int outroValor = 42;
        System.out.println(
            // Utilizamos o método toBinaryString da classe Integer para converter o número inteiro em uma representação binária.
            Integer.toBinaryString((outroValor))
        );
    }
}
