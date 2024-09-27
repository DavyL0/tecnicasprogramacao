package ex3.entities;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada extends Lista{
    public ListaOrdenada(List<Integer> lista, int posicao, int numero) {
        super(lista, posicao, numero);
    }

    public void sort() {
       Collections.sort(numeros); // Ordena a lista após inserir o número
    }
}
