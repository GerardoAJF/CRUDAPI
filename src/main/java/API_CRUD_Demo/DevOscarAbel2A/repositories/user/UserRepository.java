package API_CRUD_Demo.DevOscarAbel2A.repositories.user;

import API_CRUD_Demo.DevOscarAbel2A.entities.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/// ACA ES DONDE IRA LA LOICA DE NEGOCIO Y GRACIAS A JPAREPOSITORY PUES YA ESTAAAA HAHSHHSJ
/// SADASJDK
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
//Guardar: Save
//Buscar: Find All
