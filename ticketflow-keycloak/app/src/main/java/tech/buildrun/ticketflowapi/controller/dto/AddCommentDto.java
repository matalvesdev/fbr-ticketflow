package tech.buildrun.ticketflowapi.controller.dto;

import tech.buildrun.ticketflowapi.entities.AuthorType;
import tech.buildrun.ticketflowapi.entities.Ticket;
import tech.buildrun.ticketflowapi.entities.TicketComment;

import java.util.UUID;

public record AddCommentDto(String message) {

    public TicketComment toEntity(Ticket ticket,
                                  AuthorType authorType,
                                  String authorId) {

        var entity = new TicketComment();

        entity.setAuthorId(UUID.fromString(authorId));
        entity.setMessage(message);
        entity.setTicketId(ticket);
        entity.setAuthorType(authorType);

        return entity;
    }
}
