package banco;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numero;
    private Cliente cliente;
    private double saldo;
    private List<Transacao> historico;

    public ContaBancaria(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add(new Transacao(valor, "Depósito"));
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.add(new Transacao(-valor, "Saque"));
            return true;
        }
        return false; // Saldo insuficiente
    }

    public List<Transacao> getHistorico() {
        return historico;
    }
}