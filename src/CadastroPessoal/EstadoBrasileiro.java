package CadastroPessoal;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "SAO PAULO", 12),
    RIO_JANEIRO ("RJ", "RIO DE JANEIRO", 13),
    PARANA ("PR", "PARANA", 20),
    SANTA_CATARINA ("SC", "SANTA CATARINA", 14),
    RIO_GRANDE_DO_SUL ("RS", "RIO GRANDE DO SUL", 15);

    private String nome;
    private String sigla;
    private int ibge;

    EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void status(){
        System.out.println("Cadastro do IBGE");
        System.out.println("Nomes do Estado:" + this.nome);
        System.out.println("Siglas: " + this.sigla + " Codigo: " + this.ibge);

    }

}
