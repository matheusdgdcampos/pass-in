package rocketseat.com.passin.dto.attendee;

import lombok.Getter;

import java.util.List;

public record AttendeeListResponseDTO (List<AttendeeDetails> attendees) {
}
