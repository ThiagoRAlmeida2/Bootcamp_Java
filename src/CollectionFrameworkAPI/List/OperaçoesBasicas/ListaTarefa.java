package CollectionFrameworkAPI.List.OperaçoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : this.tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        this.tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }
}