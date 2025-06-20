package API_CRUD_Demo.DevOscarAbel2A.controllers.cargos;

import API_CRUD_Demo.DevOscarAbel2A.model.DTO.DTOCargo;
import API_CRUD_Demo.DevOscarAbel2A.services.cargos.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiCargo")
public class CargoController {

    @Autowired
    private CargoService service;

    @GetMapping("/getDataCargos")
    public List<DTOCargo> getAllCargos () {
        return service.getAllCargos();
    }
}
