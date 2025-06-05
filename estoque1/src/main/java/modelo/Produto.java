package modelo;

import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    private String unidade; // "kg","un"
    private BigDecimal valorUnitario;
    private int qtdMin;
    private int qtdMax;
    private int qtdAtual;
    private Categoria categoria;

    public Produto() {}

    public Produto(String nome, int id, String unidade, int qtdMin, int qtdMax, int qtdAtual) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
        this.qtdMin = qtdMin;
        this.qtdMax = qtdMax;
        this.qtdAtual = qtdAtual;
        this.categoria = categoria;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }

    public BigDecimal getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(BigDecimal valorUnitario) { this.valorUnitario = valorUnitario; }

    public int getQtdMin() { return qtdMin; }
    public void setQtdMin(int qtdMin) { this.qtdMin = qtdMin; }

    public int getQtdMax() { return qtdMax; }
    public void setQtdMax(int qtdMax) { this.qtdMax = qtdMax; }

    public int getQtdAtual() { return qtdAtual; }
    public void setQtdAtual(int qtdAtual) { this.qtdAtual = qtdAtual; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return nome + " (" + unidade + ")";
    }
}
