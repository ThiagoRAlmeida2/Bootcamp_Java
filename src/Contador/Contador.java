package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal =new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        // O parametroUm tem que ser menor que o parametroDois
        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        // Será feita a contagem dos valores entre os dois parametros (2-5= 3) Logo, será 1, 2, 3.
        for(int i = 1 ; i <= contagem ; i++){
            System.out.println("imprimindo o numero: " + i);
        }
    }
}
