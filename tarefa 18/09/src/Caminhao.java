package src;

public class Caminhao extends Veiculo{
    private int capacidade;

    public Caminhao(String nome, int rodas, int capacidade) {
        super(nome, rodas);
        this.capacidade=capacidade;
    }
    public int getcapacidade(){
        return capacidade;
    }
    @Override
    public void info() {
        System.out.println("nome: "+ getnome()+" rodas:"+getrodas()+" capacidade:"+getcapacidade());
    }
    public void acelerar(){
        System.err.println("Acelerando");
    }
    
}
