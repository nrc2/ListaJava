package tarefas;


public class LiderEquipe extends MembroEquipe {
    public LiderEquipe(String nome) {
        super(nome);
    }

    public void lideranca(){
        System.out.println("Eu sou o lider");
    }
}
