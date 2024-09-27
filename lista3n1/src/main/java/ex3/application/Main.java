package ex3.application;

import ex3.entities.Lista;
import ex3.entities.ListaOrdenada;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        int opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Inserir número");
            System.out.println("2 - Remover número");
            System.out.println("3 - Exibir lista");
            System.out.println("4 - Mostrar quantidade de números");
            System.out.println("5 - Obter número por posição");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para inserir: ");
                    int numeroInserir = scanner.nextInt();
                    listaOrdenada.inserirNumero(numeroInserir);
                    System.out.println("Número inserido.");
                    break;
                case 2:
                    System.out.print("Digite um número para remover: ");
                    int numeroRemover = scanner.nextInt();
                    listaOrdenada.removerNumero(numeroRemover);
                    System.out.println("Número removido.");
                    break;
                case 3:
                    System.out.println("Elementos na lista: ");
                    listaOrdenada.();
                    break;
                case 4:
                    System.out.println("Quantidade de números armazenados: " + listaOrdenada.contaLista());
                    break;
                case 5:
                    System.out.print("Digite a posição do número: ");
                    int posicao = scanner.nextInt();
                    try {
                        int numeroNaPosicao = listaOrdenada.informaValor(listaOrdenada.getPosicao());
                        System.out.println("Número na posição " + posicao + ": " + numeroNaPosicao);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Posição inválida!");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

    }
}
