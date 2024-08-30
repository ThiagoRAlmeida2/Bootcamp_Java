package CollectionFrameworkAPI.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics

        List ListaSemGeneris = new ArrayList();
        ListaSemGeneris.add("Elemento 1");
        ListaSemGeneris.add(10); //Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        List<String> ListaGenerics = new ArrayList();
        ListaGenerics.add("Elemento 1");
        ListaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : ListaGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessario fazer cast)
        for (Object elemento : ListaSemGeneris){
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
