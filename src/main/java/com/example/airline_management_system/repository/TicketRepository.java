package com.example.airline_management_system.repository;

import com.example.airline_management_system.dto.TicketDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    private final List<TicketDTO> tickets = new ArrayList<>();

    public List<TicketDTO> getAllTickets() {
        return new ArrayList<>(tickets);
    }

    public void addTicket(TicketDTO ticket) {
        tickets.add(ticket);
    }

    public boolean ticketExists(String id) {
        return tickets.stream().anyMatch(ticket -> ticket.getId().equals(id));
    }

    public TicketDTO getTicketById(String id) {
        return tickets.stream().filter(ticket -> ticket.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteTicket(String id) {
        tickets.removeIf(ticket -> ticket.getId().equals(id));
    }
}
