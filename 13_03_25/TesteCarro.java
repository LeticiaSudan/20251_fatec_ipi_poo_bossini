public class TesteCarro {
    public static void main(String... args){
     
        Carro carro1 = new Carro("Vanquish", "Aston Martin");
        Carro carro2 = new Carro("Valhalla", "Aston Martin");

        carro1.ligar();
        carro2.ligar();
        carro1.desligar();
        carro2.desligar();

        System.out.println("Nome carro1: " + carro1.getNome());
        System.out.println("Marca carro1: " + carro1.getMarca());
        System.out.println("Nome carro2: " + carro2.getNome());
        System.out.println("Marca carro2: " + carro2.getMarca());
    }
}