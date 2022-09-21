package Mensagem;

public class PCPedrinho {
    public static void main(String[] args) {

        System.out.println("MSNMessenger");
        MSNmessenger msn = new MSNmessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        System.out.println("Facebook");
        Facebokmessenger face = new Facebokmessenger();
        face.enviarMensagem();
        face.receberMensagem();



    }
}
