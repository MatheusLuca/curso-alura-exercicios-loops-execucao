import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana","Roberto","Marcela","Luciano"));

        String parar = null;

            while( !"sair".equalsIgnoreCase(parar)){
                System.out.println("***********************");
                System.out.println(" Incluir convidado digite 'incluir'\n Ver convidados digite 'ver'\n Digite 'sair' para terminar");
                System.out.println("***********************");
                System.out.println("Digite: ");
                String menu = sc.nextLine();
                    switch (menu){
                        case "incluir":{
                            System.out.println("Digite novo nome!");
                            String incluir = sc.nextLine();
                            nomes.add(incluir);
                            try {
                                Thread.sleep(3000);
                                System.out.println("Convidado: " + incluir + " cadastrado!");
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                            continue;
                            case "ver":{
                                System.out.println("Nomes já cadastrados: ");
                                for(String nome : nomes ){
                                    System.out.println(nome);
                                }
                            continue;
                            }
                            case "sair":{
                            parar = "sair";
                        }
                    }
                }

    }
}
