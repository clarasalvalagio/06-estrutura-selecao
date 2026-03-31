import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {

        //declaração de variáveis
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        //entrada de dados
        System.out.println("Insira o valor da primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Insira o valor da segunda nota: ");
        nota2 = sc.nextDouble();

        //processamento de dados
        media = (nota1 + nota2) / 2;

        //saída de dados
        System.out.println("O valor de sua média é de: " + media);
        if(media >= 6) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
