package CollectionFrameworkAPI.List.OperaçoesBasicas;

public class Tarefa {

    private String descricao;
    private String titulo;
    private String nome;

    public Tarefa(String descricao) {
        descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getNome(){
        return nome;
    }
}
