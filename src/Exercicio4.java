import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        System.out.println("Digite numero para calculo fatorial: ");
        Scanner input = new Scanner(System.in);
        int fatorial = input.nextInt();
        int resultadoFatorial = 1;

        for (int i = fatorial; i >= 1 ; i--) {
            resultadoFatorial = resultadoFatorial * i;
        }
        System.out.println(resultadoFatorial);
    }
}
