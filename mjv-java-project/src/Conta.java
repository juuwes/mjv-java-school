import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private Double saldo = 0.0;
    private String numeroConta;
    private String numeroAgencia;
    private boolean ativa = true;
    private List<Transacao> transacoes = new ArrayList<>();

    // Construtor da classe
    public Conta(Cliente cliente, String numeroConta, String numeroAgencia) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }

    // Métodos getters e setters
    public Cliente getCliente() {

        return cliente;
    }

    public Double getSaldo() {

        return saldo;
    }

    public String getNumeroConta() {

        return numeroConta;
    }

    public String getNumeroAgencia() {

        return numeroAgencia;
    }

    public boolean ativa() {

        return ativa;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // Depositar valor
    void depositar(Double valor) {
        if (valor >= 0 && ativa()) {
            saldo = saldo + valor;
            incluirTransacao(valor, "Depósito em Conta", "DEPÓSITO");
        }
        return;
    }

    // Sacar valor da conta
    boolean sacar(Double valor) {
        if (valor >= 0 && ativa()) {
            saldo = saldo - valor;
            incluirTransacao(valor, "Saque realizado na conta", "SAQUE");
            return true;
        } else {
            return false;
        }
    }

    // CONSULTAR SALDO
    Double consultarSaldo() {
        return saldo;
    }

    // CANCELAR + JUSTIFICATIVA
    void cancelarConta(String justificativa) {
        if (saldo == 0) {
            ativa = false;
            incluirTransacao(0.00, "Conta cancelada com sucesso", "CANCELAMENTO");
        } else {
            System.out.println("Não foi possivel realizar a operação, dirija-se a sua agência.");
            incluirTransacao(saldo, "Falha ao cancelar - Saldo residual", "FALHA CANCELAMENTO");
        }
    }

    // Transferir um valor de uma conta para outra
    void transferir(Conta contaDestino, Double valor) {
        if (valor >= saldo) {
            contaDestino.depositar(valor);
            this.sacar(valor);
        }

        incluirTransacao(valor, "Transferência realizada com sucesso", "TRANSFERÊNCIA");
    }

    void consultarExtrato() {
        for (Transacao transacao : transacoes) {
            transacao.toString();
        }
        return;
    }

    // REFLETIR EXTRATO DAS TRANSAÇÕES
    void incluirTransacao(Double valor, String descricao, String tipo) {
        Transacao t = new Transacao();

        t.data = LocalDate.now();
        t.tipo = tipo;
        t.descricao = descricao;
        t.valor = valor;
        transacoes.add(t);

    }
}