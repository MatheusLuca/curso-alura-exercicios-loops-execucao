import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros:");
        String stringNumeros = sc.nextLine();
        String [] numeros = stringNumeros.split(" ") ;
        int [] arrayNumero = new int[5];
            for(int i = 0 ; i < numeros.length; i++){
                int resultado = Integer.parseInt(numeros[i]);
                arrayNumero[i] = resultado;
            }
        int maior = arrayNumero[0];

            for(int i = 0 ; i < arrayNumero.length; i++) {

                if( arrayNumero[i] > maior){
                    maior = arrayNumero[i];
                }

            }

        System.out.println(maior);
    }
}
