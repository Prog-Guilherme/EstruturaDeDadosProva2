package teste;

import java.util.Scanner;

import br.edu.iftm.prova2.MDC;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner valorMDC = new Scanner(System.in);

        MDC mdc = new MDC();

        while (true) {
            System.out.print("Digite o primeiro valor: ");
            int valor1 = valorMDC.nextInt();
            System.out.print("Digite o segundo valor: ");
            int valor2 = valorMDC.nextInt();

            if (valor1 == -1 || valor2 == -1)
                break;

            int resposta = mdc.mdc(valor1, valor2);

            System.out.println("Resultado: " + resposta);
            break;
        }
    }
}
