package teste;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner valorEntrada = new Scanner(System.in);
        int sair = 0;

        Stack<Integer> pilha = new Stack<Integer>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        while (sair != 5) {

            System.out.println("1. Empilhar. ");
            System.out.println("2. Desempilhar. ");
            System.out.println("3. Mostrar o topo. ");
            System.out.println("4. Mostrar pilha zerando. ");
            System.out.println("5. Sair! \n");

            System.out.print("Selecione a opção: ");
            sair = valorEntrada.nextInt();

            if (sair == 1) {
                System.out.print("Digite o numero para empilhar: ");
                int valorpilha = valorEntrada.nextInt();
                pilha.push(valorpilha);
            } else if (sair == 2) {
                if (!pilha.isEmpty()) {
                    System.out.print("Digite o numero para desempilhar: ");
                    pilha.pop();
                    System.out.println("\n Desempilhado!");
                } else {
                    System.out.println(" A pilha Vazia!");
                }
            } else if (sair == 3) {
                if (!pilha.isEmpty()) {
                    System.out.println("Primeira Posição: " + pilha.lastElement());
                } else {
                    System.out.println("A pilha Vazia!");
                }
            } else if (sair == 4) {
                System.out.print("Mostrar pilha: ");
                for (int i = pilha.size() - 1; i >= 0; i--) {
                    System.out.print(pilha.get(i) + " ");
                }
                System.out.println("\nPilha zerada!");
                pilha.clear();
            }
        }
    }
}
