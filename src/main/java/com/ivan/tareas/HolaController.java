package com.ivan.tareas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolaController {

    private final TareaService tareaService;

    public HolaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/tareas")
    public List<Tarea> getTareas() {
        return tareaService.obtenerTodas();
    }

    @PostMapping("/tareas")
    public void agregarTarea(@RequestBody Tarea tarea) {
        tareaService.añadirTarea(tarea);
    }

    @PutMapping("/tareas/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/tareas/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}
