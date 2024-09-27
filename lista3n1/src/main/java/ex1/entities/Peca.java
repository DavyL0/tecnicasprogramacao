package ex1.entities;

/*
 * @created 23/09/2024 - 20:07
 * @project lista3n1
 * @Aauthor Davy
 */
public class Peca {
    private String nome;
    private float custo;
    private float lucro;

    public Peca(){

    }

    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public float calculaPreco(){
        return this.custo+ this.lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }


    public void exibir() {
        System.out.println("Nome: " + this.nome );
        System.out.println("Custo: " + this.custo );
        System.out.println("Lucro: " + this.lucro );
        System.out.println("Preço Cliente: " + this.calculaPreco());
    }
}
