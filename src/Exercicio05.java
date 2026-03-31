import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        //declaração de variáveis
        Scanner sc = new Scanner(System.in);

        double valorCheio, valorDesconto, valorFinal;

        //entrada de dados
        System.out.println("Informe o valor total da sua compra: ");
        valorCheio = sc.nextDouble();

        //processamento de dados
        if (valorCheio > 1000) {
            valorDesconto = valorCheio * 15/100;
        }
        else {
            valorDesconto = valorCheio * 8/100;
        }
        valorFinal = valorCheio - valorDesconto;

        //saída de dados
        System.out.println("O valor Final de sua compra é de R$" + valorFinal);
        System.out.println("O valor Descontado de sua compra é de R$" + valorDesconto);

    }
}
