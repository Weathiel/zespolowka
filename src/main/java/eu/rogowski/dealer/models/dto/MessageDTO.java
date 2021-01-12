package eu.rogowski.dealer.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private String message;
    private String subject;
    private String from;
}
