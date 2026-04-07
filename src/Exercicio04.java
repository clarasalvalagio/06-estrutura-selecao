import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        //declaração de variáveis
        Scanner sc = new Scanner(System.in);

        double x, y;

        //entrada de dados
        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();

        //processamento de dados
        if (x >= -5 && x <= 5) {
            //saída de dados
            System.out.println("A expressão não pode ser calculada");
        }
        else {
            y = 8 / Math.sqrt(x * x - 25);
            //saída de dados
            System.out.println("y = " + y);
        }

    }
}
