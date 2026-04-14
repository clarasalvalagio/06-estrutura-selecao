import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        //declaração de variáveis
        Scanner sc = new Scanner(System.in);

        int ano;

        //entrada de dados
        System.out.println("Informe o Ano: ");
        ano = sc.nextInt();

        //processamento de dados
        if (( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0)) {
            System.out.println(" O ano informado é bissexto! ");
        }
        else{
            System.out.println(" O ano informado não é bissexto :( ");
        }
    }
}
