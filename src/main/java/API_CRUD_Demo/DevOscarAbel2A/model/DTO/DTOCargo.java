package API_CRUD_Demo.DevOscarAbel2A.model.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DTOCargo {

    @NotBlank
    private Long id;
    @NotBlank
    private String cargo;
}
