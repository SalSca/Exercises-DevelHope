package co.develhope.websocket2.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientMessageDTO {

    private String from;
    private String text;
    private String friend;
}