package API_CRUD_Demo.DevOscarAbel2A.controllers.users;

import API_CRUD_Demo.DevOscarAbel2A.model.DTO.DTOUser;
import API_CRUD_Demo.DevOscarAbel2A.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUser")
public class UserController {

    @Autowired
    private UserServices service;

    @GetMapping("/getDataUsers")//Indicamos el endPoin
    public List<DTOUser> getUsers(){

        return service.getAllUsers();
    }
}
