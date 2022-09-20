package Autodromo;

public class AutodromoI {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        fusca.ligar();
        fusca.setChassis("253b");

        Moto lambreta = new Moto();
        lambreta.setChassis("1234s");
        lambreta.ligar();

        //Polimorfismo
        Veiculo coringa = fusca;
        coringa.ligar();


    }
}
