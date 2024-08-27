package ChatPoo;

import ChatPoo.app.FacebookMessenger;
import ChatPoo.app.MSNMessenger;
import ChatPoo.app.ServicoMensagemInstantanea;
import ChatPoo.app.Telegram;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
           smi = new MSNMessenger();
         else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
         else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}