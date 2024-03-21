package modelos;

import enums.Ticket;

public class Adulto extends Pessoa {
    
    public Adulto(String nome, int idade) {
        super(nome, idade);
    }
    
    public Ticket getTicketType() {
        return Ticket.ADULTO;
    }
}

