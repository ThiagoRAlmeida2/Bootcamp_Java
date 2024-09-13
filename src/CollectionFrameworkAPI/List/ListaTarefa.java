package CollectionFrameworkAPI.List;

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

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Bem vindo a lista de tarefas ");
        listaTarefa.adicionarTarefa("A");
        listaTarefa.adicionarTarefa("B");
        listaTarefa.adicionarTarefa("C");

        System.out.println("Eu tenho: " + listaTarefa.obterNumeroTotalTarefas() + "Tafas na lista");
        listaTarefa.obterDescricaoTarefa();

        listaTarefa.removerTarefa("Tarefas");

        System.out.println("Agora eu tenho: " + listaTarefa.obterNumeroTotalTarefas() + "Tafas na lista");
        listaTarefa.obterDescricaoTarefa();

        listaTarefa.removerTarefa("B");

        System.out.println("Agora eu tenho: " + listaTarefa.obterNumeroTotalTarefas() + "Tafas na lista");
    }
}