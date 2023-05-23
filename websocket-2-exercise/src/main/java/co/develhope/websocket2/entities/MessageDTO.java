package co.develhope.websocket2.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MessageDTO {

    private String type;
    private String message;
}