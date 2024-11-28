package pe.edu.vallegrande.tranformacion.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.tranformacion.model.Goal;
import pe.edu.vallegrande.tranformacion.repository.GoalRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoalService {
    private final GoalRepository goalRepository;

    public List<Goal> findAll() {
        return goalRepository.findAll();
    }

    public Goal findById(Long id) {
        return goalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Goal not found"));
    }

    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    public Goal update(Long id, Goal goal) {
        Goal existingGoal = findById(id);
        goal.setId_goal(existingGoal.getId_goal());
        return goalRepository.save(goal);
    }

    public void delete(Long id) {
        goalRepository.deleteById(id);
    }
}