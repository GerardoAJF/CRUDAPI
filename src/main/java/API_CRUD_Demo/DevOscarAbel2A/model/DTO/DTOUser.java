package API_CRUD_Demo.DevOscarAbel2A.model.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DTOUser {
    @NotBlank
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @NotBlank
    private Long expoGroupId;
    @NotBlank
    private Long roleId;
    @NotBlank @Email
    private String email;
    @NotBlank  @Size(min=8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;
    @NotBlank
    private Long positionId;
}
