package ex2.entities;

/*
 * @created 23/09/2024 - 20:37
 * @project lista3n1
 * @Aauthor Davy
 */public class Estadual extends Produto {
    public Estadual(double imposto, float valor, String descricao) {
        super(imposto, valor, descricao);
    }

    public double calculaEstadual(){
        return this.getValor() + (this.getValor() * this.getImposto());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + super.getDescricao() + '\'' +
                ", valor=" + super.getValor() + '\'' +
                ", imposto=" + super.getImposto() + '\'' +
                ", Total =" + calculaEstadual() +
                '}';
    }
}
