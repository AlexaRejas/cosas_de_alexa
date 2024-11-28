package pe.edu.vallegrande.tranformacion.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.tranformacion.model.Action;
import pe.edu.vallegrande.tranformacion.repository.ActionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionService {
    private final ActionRepository actionRepository;

    public List<Action> findAll() {
        return actionRepository.findAll();
    }

    public Action findById(Long id) {
        return actionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Action not found"));
    }

    public Action save(Action action) {
        return actionRepository.save(action);
    }

    public Action update(Long id, Action action) {
        Action existingAction = findById(id);
        action.setId(existingAction.getId());
        return actionRepository.save(action);
    }

    public void delete(Long id) {
        actionRepository.deleteById(id);
    }
}