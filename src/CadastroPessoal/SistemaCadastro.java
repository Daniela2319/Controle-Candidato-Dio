package CadastroPessoal;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123", "Rua bromelias");
        marcos.status();

        Pessoa frank = new Pessoa("Frank", "124", marcos.getEnderenco());
        frank.status();
    }
}
