package executavel;
import tarefas.*;

import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        MembroEquipe membro1 = new MembroEquipe("João");
        MembroEquipe membro2 = new MembroEquipe("Maria");
        LiderEquipe lider1 = new LiderEquipe("Pedro");

        Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("Desenvolvimento de código", membro1);
        Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("Correção de bugs", membro2);
        Tarefa<MembroEquipe> tarefa3 = new Tarefa<>("Revisão de código", membro2);

        List<Tarefa<MembroEquipe>> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);

        int cargaJoao = Tarefa.calcularCargaDeTrabalho(tarefas, membro1);
        int cargaMaria = Tarefa.calcularCargaDeTrabalho(tarefas, membro2);

        System.out.println("Carga de trabalho do João: " + cargaJoao);
        System.out.println("Carga de trabalho da Maria: " + cargaMaria);
    }
}