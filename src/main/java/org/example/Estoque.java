package org.example;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void excluirProduto(int codigo) {
        if(produtos.isEmpty()){
            System.out.println("Lista vazia!");
        } else
           for (Produto produto : produtos) {
            if(produto.getCodigo() == codigo){
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

}
