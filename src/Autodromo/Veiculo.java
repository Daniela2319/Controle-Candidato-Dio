package Autodromo;


// Parte abstração feito na classe veículo
public abstract class  Veiculo {
    private String chassis;

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public abstract void ligar();


}
