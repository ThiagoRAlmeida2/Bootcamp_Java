package CollectionFrameworkAPI.List;

public class Tarefa {

    private String descricao;
    private String titulo;

    public Tarefa(String descricao) {
        descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo(){
        return titulo;
    }
}
