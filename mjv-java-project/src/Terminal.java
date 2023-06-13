
public class Terminal {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        System.out.println(conta.ativa);
        conta.cancelarConta("");
        System.out.println(conta.ativa);

        }
    }
