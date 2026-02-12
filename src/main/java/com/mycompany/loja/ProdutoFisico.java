
package com.mycompany.loja;

public class ProdutoFisico extends Produto{
    protected Integer qtdeEstoque;
    
    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) throws Exception {
        if(qtdeEstoque < 0)
            throw new Exception("Quantidade do produto não pode ser negativa!");
        this.qtdeEstoque = qtdeEstoque;
    }
    
    @Override
    public void criarProduto(){
        this.descricao = "Produto deve ser retirado na Loja";
    }
    
    
}
