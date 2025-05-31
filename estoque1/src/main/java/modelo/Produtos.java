package modelo;

public class Produtos {
    private String nome;
    private String codigo;
    private String categoria;
    private int qtdAtual;
    private int qtdMinima;
    private int qtdMaxima;
    private double preco;

    public Produtos(String nome, int qtdAtual, String codigo, int qtdMinima, int qtdMaxima, int par1, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        this.qtdMaxima = qtdMaxima;
        this.preco = preco;
    }

    public void entrada(int quantidade) {
        qtdAtual += quantidade;
        if (qtdAtual > qtdMaxima) {
            System.out.println("Estoque de " + nome + " excedeu o máximo (" + qtdAtual + " > " + qtdMaxima + ")");
        }
    }

    public void saida(int quantidade) {
        if (quantidade > qtdAtual) {
            System.out.println("Estoque insuficiente. Disponível: " + qtdAtual);
        } else {
            qtdAtual -= quantidade;
            if (qtdAtual < qtdMinima) {
                System.out.println("Estoque de " + nome + " abaixo do mínimo (" + qtdAtual + " < " + qtdMinima + ")");
            }
        }
    }

    public void reajustarPreco(double percentual) {
        preco *= (1 + percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public void setPreco(double preco) {
        this.preco = preco;
   
    }
}

