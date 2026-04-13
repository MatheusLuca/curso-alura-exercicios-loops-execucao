import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("Insira numeros positivos e negativos. \nDigite fim para parar o programa! ");
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();


        String input = null;
        while (input != "fim") {
            System.out.println("Insira numero: ");
            input = sc.nextLine();
                try{
                    int numero = Integer.parseInt(input);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    input = "fim";
                }
        }

        int negativo = 0, positivo = 0;
        for (int i = 0; i < numeros.toArray().length ; i++) {
            if( numeros.get(i) > 0){
                ++positivo;
            }else{
                ++negativo;
            }
        }
        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);
    }
}
