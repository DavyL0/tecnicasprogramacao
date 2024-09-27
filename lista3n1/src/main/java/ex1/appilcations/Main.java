package ex1.appilcations;

import ex1.entities.Peca;
import ex1.entities.PecaImportada;

/*
 * @created 23/09/2024 - 20:09
 * @project lista3n1
 * @Aauthor Davy
 */public class Main {
    public static void main(String[] args) {
        Peca peca1 = new Peca("Escapamento",100, 110 );
        peca1.exibir();

        PecaImportada peca2 = new PecaImportada("Radiador", 200,200,100,2);
        peca2.exibir();
    }
}
