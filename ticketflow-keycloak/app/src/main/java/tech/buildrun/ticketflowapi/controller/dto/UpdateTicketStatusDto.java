package tech.buildrun.ticketflowapi.controller.dto;

import tech.buildrun.ticketflowapi.entities.TicketStatus;

public record UpdateTicketStatusDto(TicketStatus status) {
}
