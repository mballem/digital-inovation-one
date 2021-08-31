package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    public static final String CREATED_ID = "Created person with ID ";
    public static final String UPDATED_ID = "Updated person with ID ";

    private String message;
}
