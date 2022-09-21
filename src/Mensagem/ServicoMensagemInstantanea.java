package Mensagem;


// A classe MSNmessenger é ou representa caso é o molde
public class ServicoMensagemInstantanea {

    public void enviarMensagem(){
        // Primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando Mensagem ");
        // Depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();

    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem ");
    }
    // Metodos privados
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }

}
