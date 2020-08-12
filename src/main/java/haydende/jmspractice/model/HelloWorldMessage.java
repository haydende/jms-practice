package haydende.jmspractice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// if sending this as an object message, you will need to implement Serializable
// otherwise it is not necessary
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 133713185441244394L;

    private UUID id;
    private String message;
}
