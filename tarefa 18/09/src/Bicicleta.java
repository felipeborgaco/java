package src;

public class Bicicleta extends Veiculo {
    private String estilo;
    public Bicicleta(String nome, int rodas,String estilo) {
        super(nome, rodas);
        this.estilo=estilo;
    }
    public String getestilo(){
        return estilo;
    }
    public void pedalar(){
        System.err.println("Pedalando");
    }
    @Override
    public void info() {
        System.out.println("nome: "+getnome() +" rodas:"+getrodas()+" estilo:"+getestilo());
    }
}