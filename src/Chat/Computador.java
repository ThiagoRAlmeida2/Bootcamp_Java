package Chat;

public class Computador {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msnm = new MSNMessenger();
        msnm.enviarMensagem();
        msnm.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
