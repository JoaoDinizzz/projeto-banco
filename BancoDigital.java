package banco;

public class BancoDigital {
    public static void main(String[] args) {
        // Criação de um cliente
        Cliente cliente = new Cliente("João", "123.456.789-00");

        // Criação de uma conta bancária para o cliente
        ContaBancaria conta = new ContaBancaria("001", cliente);

        // Realiza operações na conta
        conta.depositar(12467);
        conta.sacar(3500);

        // Exibe o saldo e o histórico da conta
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        System.out.println("Histórico de transações:");
        for (Transacao transacao : conta.getHistorico()) {
            System.out.println(transacao.getDescricao() + ": R$" + transacao.getValor());
        }
    }
}