package com.ivan.tareas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
