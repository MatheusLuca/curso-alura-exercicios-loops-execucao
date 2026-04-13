import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "Joao", "Fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equalsIgnoreCase("mariana")){
                System.out.println("Deregay");
                continue;
            }
            System.out.printf("%s - comissão %.2f\n", vendedores[i], calcularComissao(vendas[i]));
        }

        System.out.println("\n testando com while");
        int j = 0;
        boolean imprimeOutro = true;
        Scanner leitura = new Scanner(System.in);


        while( imprimeOutro){
            System.out.printf("%s - comissão %.2f\n", vendedores[j], calcularComissao(vendas[j]));
            j++;
            System.out.println("\nDeseja imprimir outro?");
            imprimeOutro = leitura.nextBoolean();
        }

    }

    public static double calcularComissao (double totalVendas){
        if(totalVendas <= 5000){
            return totalVendas * 0.03;
        }else if (totalVendas <= 10000){
            return totalVendas * 0.05;
        } else{
            return totalVendas * 0.07;
        }
    }

}
