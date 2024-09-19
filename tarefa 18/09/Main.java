import src.*;
public class Main {

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Bicicleta", 2,"Street");
        bicicleta.info();
        bicicleta.pedalar();
        Carro carro = new Carro("Carro", 4,"V8");
        carro.info();
        Caminhao caminhao = new Caminhao("Caminhao", 6, 1000);
        caminhao.info();
        caminhao.acelerar();
    }
    
}
