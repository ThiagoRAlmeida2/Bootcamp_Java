package Chat;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        // Primeiro Confirma se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        // Depois de enviada, salva o historico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }

    // Métodos privados, visiveis somemente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a Internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da Mensagem");
    }
}
