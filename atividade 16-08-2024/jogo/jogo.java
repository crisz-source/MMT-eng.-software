public class Jogo {

    private String titulo;
    private String classificacaoEtaria;
    private double preco;


    public Jogo(String titulo, String classificacaoEtaria, double preco) {
        this.titulo = titulo;
        this.classificacaoEtaria = classificacaoEtaria;
        this.preco = preco;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void aplicarDesconto(double percentual) {
        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;
    }


    public void aumentarPreco(double percentual) {
        double aumento = this.preco * (percentual / 100);
        this.preco += aumento;
    }

    public void atualizarClassificacao(String novaClassificacao) {
        this.classificacaoEtaria = novaClassificacao;
    }


    @Override
    public String toString() {
        return "Título: " + titulo + 
               ", Classificação Etária: " + classificacaoEtaria + 
               ", Preço: R$" + String.format("%.2f", preco);
    }
}
