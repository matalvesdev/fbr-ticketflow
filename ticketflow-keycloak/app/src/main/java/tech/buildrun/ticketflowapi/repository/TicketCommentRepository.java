package tech.buildrun.ticketflowapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.ticketflowapi.entities.TicketComment;

import java.util.UUID;

public interface TicketCommentRepository extends JpaRepository<TicketComment, UUID> {
}
