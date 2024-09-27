package ex2.entities;

/*
 * @created 23/09/2024 - 20:37
 * @project lista3n1
 * @Aauthor Davy
 */public class Produto {
     private String descricao;
     private float valor;
     private double imposto;

    public Produto(double imposto, float valor, String descricao) {
        this.imposto = imposto;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        imposto = 0.1;
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                '}';
    }
}
