package API_CRUD_Demo.DevOscarAbel2A.services.cargos;

import API_CRUD_Demo.DevOscarAbel2A.entities.cargos.CargoEntity;
import API_CRUD_Demo.DevOscarAbel2A.model.DTO.DTOCargo;
import API_CRUD_Demo.DevOscarAbel2A.repositories.cargos.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.stream.Collectors;

public class CargoService {

    @Autowired
    private CargosRepository repo;

    public List<DTOCargo> getAllCargos () {
        List<CargoEntity> cargos = repo.findAll();

        return cargos.stream().map(this::convertirACargoDTO).collect(Collectors.toList());

    }

    public DTOCargo convertirACargoDTO (CargoEntity cargo) {
        DTOCargo dto = new DTOCargo();
        dto.setId(cargo.getId());
        dto.setCargo(cargo.getCargo());
        return dto;
    }
}
