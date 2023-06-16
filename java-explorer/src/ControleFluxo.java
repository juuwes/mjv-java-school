public class ControleFluxo {
    public static void main(String[] args) {
        Plano plano = Plano.TURBO;

        switch (plano) {
            case TURBO:
                System.out.println("Velocidade 5G");
                
            case MEDIA:
                System.out.println("HBO gratuito");
                
            case BASICO:
                System.out.println("100 minutos de Ligação");
        }
    };
}
