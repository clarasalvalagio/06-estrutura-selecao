import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        //declaração das variáveis
        Scanner sc = new Scanner(System.in);

        double temp;

        //entrada de dados
        System.out.println("Informe a temperatura em Graus Celsius: ");
        temp = sc.nextDouble();

        //processamento de dados
        if ( temp > 20 ) {
            System.out.println("o tempo está Quente! ");
        }
        else{
            System.out.println("o tempo está Frio :( ");
        }
    }
}
