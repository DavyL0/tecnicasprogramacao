package ex3.entities;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private int numero;
    private int posicao;
    private List<Integer> lista = new ArrayList<Integer>();

    public Lista(List<Integer> lista, int posicao, int numero) {
        this.lista = lista;
        this.posicao = posicao;
        this.numero = numero;
    }

    public void  inserirNumero(int numero){
        lista.add(numero);
        System.out.println("O número "+numero+" foi adicionado na lista");
    }

    public void removerNumero(int numero){
        lista.remove(Integer.valueOf(numero));
        System.out.println("O número "+numero+" foi removido na lista");
    }

    public int contaLista(){
        return lista.toArray().length;
    }

    public int informaValor(int posicao){
        System.out.println(lista.size());
        return posicao;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}
