package PacoteLucas;

import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de termos que deseja somar: ");
        int n = sc.nextInt();

        double soma = 0;
        int sinal = 1;

        for (int i = 1; i <= n; i++) {
            soma += sinal * (1.0 / i);
            sinal *= -1;
        }

        System.out.println("A soma dos " + n + " primeiros termos da série é: " + soma);

        sc.close();
    }
}
