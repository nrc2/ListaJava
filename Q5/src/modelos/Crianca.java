package modelos;

import enums.Ticket;

public class Crianca extends Pessoa {
    
    public Crianca(String nome, int idade) {
        super(nome, idade);
    }
    
    public Ticket getTicketType() {
        return Ticket.CRIANCA;
    }
}
