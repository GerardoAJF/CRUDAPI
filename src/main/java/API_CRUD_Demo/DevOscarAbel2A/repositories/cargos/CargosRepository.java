package API_CRUD_Demo.DevOscarAbel2A.repositories.cargos;

import API_CRUD_Demo.DevOscarAbel2A.entities.cargos.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<CargoEntity, Long> {

}
