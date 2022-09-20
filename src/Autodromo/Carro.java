package Autodromo;

// extends feito a herança junto veiculo
public class Carro extends Veiculo {



    // Exemplo de Encapsulamento: é esconder ações somente dentro da propria classe.
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Liga Carro");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
