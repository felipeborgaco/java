package src;

public class Carro extends Veiculo{
    private String motor;
    public Carro(String nome, int rodas,String motor) {
        super(nome, rodas);
        this.motor=motor;
    }
    public void acelerar(){
        System.err.println("Acelerando");
    }
    public String getmotor(){
        return motor;
    }
    @Override
    public void info() {
        System.out.println("nome: "+ getnome()+" rodas:"+getrodas()+" motor:"+getmotor());

    }
    
}
