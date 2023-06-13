import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    String nomeCliente;
    double Saldo;
    LocalDate dataNascimento;
    int numeroConta;
    int numeroAgencia;
    boolean ativa;

    Double consultarSaldo() {
        return 0.0;
    }

    List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        return null;
    }

    void cancelarConta(String justificativa) {
        this.ativa = false;
    }

    void sacar(double valor) {
    }

    void transferir(ContaCorrente contaDestino, Double valor) {
    }
}
