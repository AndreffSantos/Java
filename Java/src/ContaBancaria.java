public class ContaBancaria {
    void mostraMensagem() {
        System.out.println("Conta bancária acessada.");
    }

    void depositar(float valor) {
        System.out.println("Valor depositado: ");
        System.out.println(valor);
    }

    float converterMoeda(float total, float cambio) {
        return total * cambio;
    }
}