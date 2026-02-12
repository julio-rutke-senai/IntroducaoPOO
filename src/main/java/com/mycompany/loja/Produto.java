
package com.mycompany.loja;

public class Produto {
    protected Long codigo;
    protected String nome;
    protected Float preco;
    protected String descricao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) throws Exception {
        if(preco < 0)
            throw new Exception("Preço não pode ser negativo");
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public void criarProduto(){
        this.descricao = "Produto pronto para venda";
    }
    
    
    
}
