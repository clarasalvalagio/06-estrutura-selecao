import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        //declaração de variáveis
        Scanner sc = new Scanner(System.in);

        double LadoA, LadoB, LadoC;

        //entrada de dados
        System.out.println("Informe o tamanho do lado A: ");
        LadoA = sc.nextDouble();

        System.out.println("Informe o tamanho do lado B: ");
        LadoB = sc.nextDouble();

        System.out.println("Informe o tamanho do lado C: ");
        LadoC = sc.nextDouble();

        //processamento de dados
        if( LadoA < LadoB + LadoC && LadoB < LadoA + LadoC && LadoC < LadoA + LadoB ) {

            System.out.println("Isso é um Triângulo!");
        }
        else{
            System.out.println("Isso não é um Triângulo :(");
        }
    }
}
