package ex2.application;

import ex2.entities.Estadual;
import ex2.entities.Importado;
import ex2.entities.Nacional;

import javax.script.ScriptContext;
import java.util.*;

/*
 * @created 23/09/2024 - 20:57
 * @project lista3n1
 * @Aauthor Davy
 */public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estadual> prodEstad = new ArrayList<>();
        List<Nacional> prodNacio = new ArrayList<>();
        List<Importado> prodImpos = new ArrayList<>();

        int digite;
        do {
            System.out.println("""
            MENU
            1 - Cadastrar Produto Estadual
            2 - Cadastrar Produto Nacional 
            3 - Cadastrar Produto Importado 
            4 - Exibir Produto Estadual
            5 - Exibir Produto Nacional 
            6 - Exibir Produto Importado
            7 - Exibir Todos os Produtos 
            8 - SAIR
                    """);
            digite = sc.nextInt();

            if(digite == 1){
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor: ");
                float valor = sc.nextFloat();
                prodEstad.add(new Estadual(0.1, valor, nome));

            } else if (digite == 2) {
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor: ");
                float valor = sc.nextFloat();
                prodNacio.add(new Nacional(0.1, valor, nome, 0.05));
            } else if (digite == 3) {
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor: ");
                float valor = sc.nextFloat();
                prodImpos.add(new Importado(0.1, valor, nome, 0.05));
            } else if (digite == 4) {
                System.out.println(prodEstad);
            } else if (digite == 5) {
                System.out.println(prodNacio);
            } else if (digite == 6) {
                System.out.println(prodImpos);
            } else if (digite == 7) {
                System.out.println("Produtos Estaduais: " + prodEstad);
                System.out.println("Produtos Nacionais: " + prodNacio);
                System.out.println("Produtos Importados: " + prodImpos);
            }else if(digite != 8){
                System.out.println("Digite um valor válido");
            }
        }while(digite != 8);

        System.out.println("Obrigado pela preferência");
    }
}
