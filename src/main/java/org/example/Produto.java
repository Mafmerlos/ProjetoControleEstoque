package org.example;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto - " +
                "Codigo: " + codigo +
                ", Nome: " + nome +
                ", Preco: " + preco +
                ", Quantidade: " + quantidade +
                ", Categoria: " + categoria;
    }

    public Produto(int codigo, String nome, double preco, int quantidade, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
}

