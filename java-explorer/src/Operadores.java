public class Operadores {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 & numero2++ == 2) //operador rigido, chega as duas operações.
            System.out.println("As duas condições são verdadeiras");

        if (numero1 == 2 && numero2++ == 2) //operador &&, checa o primeiro, se verdadeiro, checa o segundo.
            System.out.println("As duas condições são verdadeiras");
    }
}

/* @param = representa parametros do metodo
   @ return = informa a exprectativa do retorno.
   @author = autor
   @version = versão
 */