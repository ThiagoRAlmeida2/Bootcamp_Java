package Pilares_Do_Poo;

public class Autrodomo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("982492842");
        //jeep.ligar();

        Moto ninja900 = new Moto();
        ninja900.setChassi("2349284024");
        //ninja900.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
