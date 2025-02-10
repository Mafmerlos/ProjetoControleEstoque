package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

     while(true) {
         System.out.println("1- Adicionar \n" +
                 "2- Listar \n" +
                 "3- Excluir \n" +
                 "4- Alterar \n" +
                 "5- Sair");
         System.out.println("Entre com a opção desejada: ");
         int opcao = sc.nextInt();
         sc.nextLine();

         switch (opcao) {
             case 1:
                 System.out.println("Digite o codigo do produto: ");
                 int codigo = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Digite o nome do produto: ");
                 String nome = sc.nextLine();
                 System.out.println("Digite o preco do produto: ");
                 double preco = sc.nextDouble();
                 System.out.println("Digite a quantidade do produto: ");
                 int quantidade = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Digite a categoria do produto: ");
                 String categoria = sc.nextLine();

                 estoque.adicionarProduto(new Produto(codigo,nome,preco,quantidade,categoria));

                 break;
             case 2:
                 estoque.listarProdutos();
                 break;
             case 3:
                 System.out.println("Digite o codigo do produto a ser excluido:");
                 estoque.excluirProduto(sc.nextInt());
                 break;
             case 4:
                 System.out.print("Digite o código do produto a ser alterado: ");
                 int codigoAlterar = sc.nextInt();
                 sc.nextLine();
                 Produto produto = estoque.buscarProduto(codigoAlterar);

                 if (produto != null) {
                     System.out.println("Produto encontrado: " + produto.getNome());

                     System.out.print("Novo nome (Vazio mantém atual): ");
                     String novoNome = sc.nextLine();
                     if (!novoNome.isEmpty()) {
                         produto.setNome(novoNome);
                     }

                     System.out.print("Novo preço (-1 para manter atual): ");
                     double novoPreco = sc.nextDouble();
                     if (novoPreco != -1) {
                         produto.setPreco(novoPreco);
                     }

                     System.out.print("Nova quantidade (-1 para manter a atual): ");
                     int novaQuantidade = sc.nextInt();
                     if (novaQuantidade != -1) {
                         produto.setQuantidade(novaQuantidade);
                     }
                     sc.nextLine();

                     System.out.print("Nova categoria (Vazio mantém atual): ");
                     String novaCategoria = sc.nextLine();
                     if (!novaCategoria.isEmpty()) {
                         produto.setCategoria(novaCategoria);
                     }

                     System.out.println("Produto atualizado com sucesso!");
                 } else {
                     System.out.println("Produto com código " + codigoAlterar + " não encontrado.");
                 }
                 break;
             case 5:
                 System.out.println("Programa finalizado");
                 sc.close();
                 return;
             default:
                 System.out.println("Entre com uma opção válida...");
         }


     }
    }
}