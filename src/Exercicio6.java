import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        int senha = 123;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha. 3 tentativas ou sua senha será bloqueada!");
        int tentativas = 3;
        int senhaDigitada = sc.nextInt();

        while( senhaDigitada != senha && tentativas > 0){
            System.out.println("Senha errada. Voce possui mais " + tentativas + " tentativas antes do bloqueio de sua conta");
            tentativas--;
            senhaDigitada = sc.nextInt();
            if(tentativas == 0){
                System.out.println("Jarvis conta bloqueada");
            }
        }
    }
}
