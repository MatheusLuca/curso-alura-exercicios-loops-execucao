import java.util.Scanner;

public class Exercicio1 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");
        int degraus = sc.nextInt();


        for (int i = 1; i <= degraus ; i++) {
            try {
                Thread.sleep(500); // 2 segundos (em milissegundos)
                if(i == 1){
                    System.out.println("Subiu " + i + " degrau");
                } else{
                    System.out.println("Subiu " + i + " degraus");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Você chegou ao topo!!");
    }
}
