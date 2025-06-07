package modelo;

public class Produto {
    private String nome;
    private String unidade; // "kg", "lt", "un"
    private Double valorUnitario;
    private int qtdMin;
    private int qtdMax;
    private int qtdAtual;
    private Categoria categoria;

    public Produto() {}

    public Produto(String nome, String unidade, Double valorUnitario,
                   int qtdMin, int qtdMax, int qtdAtual, Categoria categoria) {
        this.nome = nome;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
        this.qtdMin = qtdMin;
        this.qtdMax = qtdMax;
        this.qtdAtual = qtdAtual;
        this.categoria = categoria;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }

    public Double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(Double valorUnitario) { this.valorUnitario = valorUnitario; }

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

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}