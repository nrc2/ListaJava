package modelos;

import enums.Ticket;

public abstract class Pessoa implements Comparable<Pessoa> {
    protected int idade;
    protected String nome;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract Ticket getTicketType();

    public int compareTo(Pessoa outraPessoa) {
        return outraPessoa.idade - this.idade;
    }

    public String getName() {
        return nome;
    }

    public int getAge() {
        return idade;
    }

    public String toString() {
        return nome + ": " + idade + "[" + getTicketType() + "]";
    }
}
