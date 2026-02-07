package tech.buildrun.ticketflowapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.ticketflowapi.entities.Ticket;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {

    List<Ticket> findByOwnerId(UUID ownerId);
}
