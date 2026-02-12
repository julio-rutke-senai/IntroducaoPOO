package com.mycompany.loja;

public class Loja {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try{
            ProdutoFisico produto = new ProdutoFisico();
            produto.setNome("Computador");
            produto.setCodigo(1L);
            produto.setPreco(-1250.00F);
            produto.setQtdeEstoque(10);
            
            produto.criarProduto();
            
            produto.setDescricao("Computador com 1TB de armazenamento e 16GB de RAM");
        } catch (Exception ex){
            System.out.println("Erro no Cadastro "+ex.getMessage());
        }

    }
}
