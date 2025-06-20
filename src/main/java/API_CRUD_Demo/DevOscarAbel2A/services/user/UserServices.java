package API_CRUD_Demo.DevOscarAbel2A.services.user;

import API_CRUD_Demo.DevOscarAbel2A.entities.user.UserEntity;
import API_CRUD_Demo.DevOscarAbel2A.model.DTO.DTOUser;
import API_CRUD_Demo.DevOscarAbel2A.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service//Obligatoriooooo ahhh hsjsjs
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<DTOUser> getAllUsers() {
        List<UserEntity> users = repo.findAll();
        return users.stream()
                .map(this::convertirAUsuarioDTO)
                .collect(Collectors.toList());
    }

    public DTOUser convertirAUsuarioDTO (UserEntity usuario) {
        DTOUser dto = new DTOUser();
        dto.setId(usuario.getId());
        dto.setName(usuario.getName());
        dto.setLastname(usuario.getLastname());
        dto.setExpoGroupId(usuario.getExpoGroupId());
        dto.setRoleId(usuario.getRoleId());
        dto.setEmail(usuario.getEmail());
        dto.setPassword(usuario.getPassword());
        dto.setPositionId(usuario.getPositionId());
        return dto;
    }
}
