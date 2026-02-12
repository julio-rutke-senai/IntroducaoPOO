package com.mycompany.loja;

public class Assinatura extends Produto {
    protected Integer recorrencia;

    public Integer getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(Integer recorrencia) {
        this.recorrencia = recorrencia;
    }
    
    @Override
    public void criarProduto(){
        this.descricao = "Assinatura apenas mensal";
    }
    
}
