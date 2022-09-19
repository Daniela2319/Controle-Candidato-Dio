package CadastroPessoal;

public class Pessoa {
    private String nome;
    private String cpf;
    private String enderenco;

    public Pessoa(String nome, String cpf, String enderenco) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderenco= enderenco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    public void status(){
        System.out.println("Cadastro Pessoal");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Enderenco " + this.enderenco);
    }
}
