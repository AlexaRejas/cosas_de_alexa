package pe.edu.vallegrande.tranformacion.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.tranformacion.model.Action;
import pe.edu.vallegrande.tranformacion.service.ActionService;

import java.util.List;

@RestController
@RequestMapping("/api/actions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ActionController {
    private final ActionService actionService;

    @GetMapping
    public List<Action> findAll() {
        return actionService.findAll();
    }

    @GetMapping("/{id}")
    public Action findById(@PathVariable Long id) {
        return actionService.findById(id);
    }

    @PostMapping
    public Action create(@RequestBody Action action) {
        return actionService.save(action);
    }

    @PutMapping("/{id}")
    public Action update(@PathVariable Long id, @RequestBody Action action) {
        return actionService.update(id, action);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        actionService.delete(id);
        return ResponseEntity.ok().build();
    }
}
