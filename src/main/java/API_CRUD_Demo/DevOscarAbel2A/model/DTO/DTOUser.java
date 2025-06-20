package API_CRUD_Demo.DevOscarAbel2A.model.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DTOUser {
    private Long id;
    private String name;
    private String lastname;
    private Long expoGroupId;
    private Long roleId;
    private String email;
    private String password;
    private Long positionId;


}
