package tarefas;

import java.util.List;


public class Tarefa<T> {
    private String descricao;
    private T responsavel; //tipo responsável generico 

    public Tarefa (String descricao, T responsavel){
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public String getDescricao(){
        return descricao;
    }

    public T getResponsavel(){
        return responsavel;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setResponsavel(T responsavel){
        this.responsavel = responsavel;
    }

     public static <T> int calcularCargaDeTrabalho(List<Tarefa<T>> tarefas, T responsavel) {
        int cargaTrabalho = 0;
        for (Tarefa<T> tarefa : tarefas) {
            if (tarefa.getResponsavel().equals(responsavel)) {
                cargaTrabalho++;
            }
        }
        return cargaTrabalho;
    }
}


