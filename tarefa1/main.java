package tarefa1;
import estoque.*;
public class main {

    public static void main(String[] args) {
        
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.Cadastrar("Banana", 10, 2.50);
        estoque.ExibirEstoque(10);
        estoque.RemoverQuantidade(5);
        estoque.ExibirEstoque(5);
    }
}
