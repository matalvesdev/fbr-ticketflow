package tech.buildrun.ticketflowapi.controller.dto;

import tech.buildrun.ticketflowapi.entities.Ticket;

import java.time.Instant;

public record ListTicketDto(String id,
                            String title,
                            String description,
                            String status,
                            Instant createdAt) {

    public static ListTicketDto fromEntity(Ticket ticket) {
        return new ListTicketDto(
                ticket.getId().toString(),
                ticket.getTitle(),
                ticket.getDescription(),
                ticket.getStatus().name(),
                ticket.getCreatedAt()
        );
    }
}
