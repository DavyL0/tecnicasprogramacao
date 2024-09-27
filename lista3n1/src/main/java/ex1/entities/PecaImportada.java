package ex1.entities;

/*
 * @created 23/09/2024 - 20:08
 * @project lista3n1
 * @Aauthor Davy
 */public class  PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calculaPreco(){
        return  this.taxaFrete + this.taxaImportacao + super.calculaPreco();
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Custo: " + this.getCusto());
        System.out.println("Lucro: " + this.getLucro());
        System.out.println("Preço Cliente: " + this.calculaPreco());
        System.out.println("Taxa Frete" + this.taxaFrete);
        System.out.println("Taxa Importação" + this.taxaImportacao);
    }
}
