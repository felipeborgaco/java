package estoque;
public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;
    
    public void Cadastrar(String descricao, int quantidade , double valor) {
        
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void RemoverQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }

    public void ExibirEstoque( int quantidade) {
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor: " + this.valor);
}

}