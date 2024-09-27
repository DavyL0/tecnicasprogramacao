package ex2.entities;

/*
 * @created 23/09/2024 - 20:37
 * @project lista3n1
 * @Aauthor Davy
 */


public class Nacional extends Produto{
    private double taxa;

    public Nacional(double imposto, float valor, String descricao, double taxa) {
        super(imposto, valor, descricao);
        this.taxa = taxa;
    }

    public double calcNacional(){
        return this.getValor() + (this.getValor() * this.getImposto()) + ((this.getValor() * this.getTaxa()));
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        taxa = 0.05;
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + super.getDescricao() + '\'' +
                ", valor=" + super.getValor() + '\'' +
                ", imposto=" + super.getImposto() + '\'' +
                ", Total =" + calcNacional() +
                '}';
    }
}
