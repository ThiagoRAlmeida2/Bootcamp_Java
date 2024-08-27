package Chat;

public class FacebookMessenger extends ServicoMensagemInstantanea{


    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
