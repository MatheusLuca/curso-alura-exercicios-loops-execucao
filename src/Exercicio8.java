import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita um numero para exibição de 1 até o numero digitado: ");
        double input = sc.nextDouble();

        ArrayList<String> numeros = new ArrayList<>();
        for (int i = 0; i <= input ; i++) {
            try{
                String numberToString = new StringBuilder().append(i).toString();
                numeros.add(numberToString);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        for (int i = 0; i < numeros.toArray().length ; i++) {
            String numero = numeros.get(i);
            char ultimoDigito = numero.charAt(numero.length() - 1);
            if ( ultimoDigito != '5'){
                System.out.print(" " + numero + " ");
            }
        }

    }
}
