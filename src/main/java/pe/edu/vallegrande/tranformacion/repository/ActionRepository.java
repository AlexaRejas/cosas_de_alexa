package pe.edu.vallegrande.tranformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.tranformacion.model.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {
}
