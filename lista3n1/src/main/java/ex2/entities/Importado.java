package ex2.entities;

/*
 * @created 23/09/2024 - 20:37
 * @project lista3n1
 * @Aauthor Davy
 */
public class Importado extends Nacional  {
     private  double taxaImportacao;

    public Importado(double imposto, float valor, String descricao, double taxa) {
        super(imposto, valor, descricao, taxa);
    }

    public double calcImportado(){
        return super.calcNacional() + (this.getValor()*this.taxaImportacao);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        taxaImportacao = 0.05;
        this.taxaImportacao = taxaImportacao;
    }
}
