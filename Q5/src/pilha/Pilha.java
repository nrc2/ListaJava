package pilha;
import modelos.*;

import java.util.ArrayList;
import java.util.Collections;

public class Pilha<T extends Pessoa> {
    private ArrayList<T> pessoas;

    public Pilha(int capacidade) {
        pessoas = new ArrayList<>(capacidade);
    }

    public Pilha() {
        pessoas = new ArrayList<>(10);
    }

    public void push(T pessoa) {
        pessoas.add(pessoa);
        Collections.sort(pessoas, Collections.reverseOrder());
    }

    public T pop() {
        if (!pessoas.isEmpty()) {
            return pessoas.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return pessoas.isEmpty();
    }
}
