package main;
import java.util.Queue;

import modelos.Adulto;
import modelos.Crianca;
import modelos.Pessoa;
import pilha.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<Pessoa> queue = new Pilha<>(5);

        queue.push(new Crianca("Crianca 1", 5));
        queue.push(new Adulto("Adulto 1", 30));
        queue.push(new Crianca("Crianca 2", 6));
        queue.push(new Adulto("Adulto 2", 20));
        queue.push(new Crianca("Crianca 3", 8));

        while (!queue.isEmpty()) {
            Pessoa p = queue.pop();
            System.out.println(p);
        }
    }
    
}
