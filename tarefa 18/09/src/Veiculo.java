package src;

public class Veiculo {
    private String nome;
    private int rodas;
    public Veiculo(String nome, int rodas) {
        this.nome=nome;
        this.rodas=rodas;
    }

    public String getnome(){
        return nome;
    }

    public int getrodas(){
        return rodas;
    }
    public void info() {
        System.out.println("nome: "+nome +" rodas:"+getrodas());
    }
}
