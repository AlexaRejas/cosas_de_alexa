package pe.edu.vallegrande.tranformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.tranformacion.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
