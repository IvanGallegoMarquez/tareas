package com.ivan.tareas;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TareaService {

    private final TareaRepository tareaRepo;

    public TareaService(TareaRepository tareaRepo) {
        this.tareaRepo = tareaRepo;
    }

    public Iterable<Tarea> obtenerTodas() {
        return tareaRepo.findAll();
    }

    public void añadirTarea(Tarea tarea) {
        tareaRepo.save(tarea);
    }

    public Tarea actualizarTarea(Long id, Tarea nuevaTarea) {
        return tareaRepo.findById(id)
                .map(tarea -> {
                    tarea.setDescripcion(nuevaTarea.getDescripcion());
                    tarea.setCompletada(nuevaTarea.isCompletada());
                    return tareaRepo.save(tarea);
                })
                .orElse(null);
    }

    public void eliminarTarea(Long id) {
        tareaRepo.deleteById(id);
    }

    // Buscar tarea por ID
    public Optional<Tarea> obtenerPorId(Long id) {
        return tareaRepo.findById(id);
    }
}
