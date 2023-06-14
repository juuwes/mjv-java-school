import java.time.LocalDate;

public class Terminal {
    public static void main(String[] args) {

        // CADASTRO DE CLIENTES
        Cliente cliente1 = new Cliente("Rosa", LocalDate.of(1963, 01, 23));
        Conta conta1 = new Conta (cliente1, "253", "25696-8");
        conta1.depositar(1000.0);

        // Testando os métodos:
        conta1.sacar(100.0);
        System.out.println(conta1.consultarSaldo());
    }
}